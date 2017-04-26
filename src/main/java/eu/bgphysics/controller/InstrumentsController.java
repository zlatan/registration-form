package eu.bgphysics.controller;


import eu.bgphysics.domain.Instruments;
import eu.bgphysics.repository.InstrumentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;

@Controller
public class InstrumentsController {

    @Autowired
    InstrumentsRepository instrumentsRepository;

    @RequestMapping(value = "/instrument", method = RequestMethod.POST)
    public ResponseEntity<String> instrumentsSubmit(@RequestBody Instruments instrument) {
        instrumentsRepository.save(instrument);
        return new ResponseEntity<String>("instruments", HttpStatus.OK);
//        return new ResponseEntity<Instruments>(instruments, HttpStatus.OK);
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> uploadFile(
            @RequestParam("uploadfile") MultipartFile uploadfile) {

        try {
            // Get the filename and build the local file path
            String filename = uploadfile.getOriginalFilename();
            String directory = "/tmp";
            String filepath = Paths.get(directory, filename).toString();

            // Save the file locally
            BufferedOutputStream stream =
                    new BufferedOutputStream(new FileOutputStream(new File(filepath)));
            stream.write(uploadfile.getBytes());
            stream.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(HttpStatus.OK);
    } // method uploadFile

}
