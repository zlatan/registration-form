package eu.bgphysics.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instruments {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String category;
    private String deviceName;
    private String schoolName;
    private String location;

    private String teacherName;
    private String teacherTelephoneNumber;
    private String teacherEmail;

    private String firstAuthorName;
    private String firstAuthorClass;
    private String firstAuthorEmail;
    private String firstAuthorTelephoneNumber;

    private String secondAuthorName;
    private String secondAuthorClass;
    private String secondAuthorEmail;
    private String secondAuthorTelephoneNumber;

    private String thirdAuthorName;
    private String thirdAuthorClass;
    private String thirdAuthorEmail;
    private String thirdAuthorTelephoneNumber;

    public Instruments(){}

    public Instruments(String category, String deviceName, String schoolName, String location, String teacherName, String teacherTelephoneNumber, String teacherEmail, String firstAuthorName, String firstAuthorClass, String firstAuthorEmail, String firstAuthorTelephoneNumber, String secondAuthorName, String secondAuthorClass, String secondAuthorEmail, String secondAuthorTelephoneNumber, String thirdAuthorName, String thirdAuthorClass, String thirdAuthorEmail, String thirdAuthorTelephoneNumber) {
        this.category = category;
        this.deviceName = deviceName;
        this.schoolName = schoolName;
        this.location = location;
        this.teacherName = teacherName;
        this.teacherTelephoneNumber = teacherTelephoneNumber;
        this.teacherEmail = teacherEmail;
        this.firstAuthorName = firstAuthorName;
        this.firstAuthorClass = firstAuthorClass;
        this.firstAuthorEmail = firstAuthorEmail;
        this.firstAuthorTelephoneNumber = firstAuthorTelephoneNumber;
        this.secondAuthorName = secondAuthorName;
        this.secondAuthorClass = secondAuthorClass;
        this.secondAuthorEmail = secondAuthorEmail;
        this.secondAuthorTelephoneNumber = secondAuthorTelephoneNumber;
        this.thirdAuthorName = thirdAuthorName;
        this.thirdAuthorClass = thirdAuthorClass;
        this.thirdAuthorEmail = thirdAuthorEmail;
        this.thirdAuthorTelephoneNumber = thirdAuthorTelephoneNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherTelephoneNumber() {
        return teacherTelephoneNumber;
    }

    public void setTeacherTelephoneNumber(String teacherTelephoneNumber) {
        this.teacherTelephoneNumber = teacherTelephoneNumber;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public String getFirstAuthorName() {
        return firstAuthorName;
    }

    public void setFirstAuthorName(String firstAuthorName) {
        this.firstAuthorName = firstAuthorName;
    }

    public String getFirstAuthorClass() {
        return firstAuthorClass;
    }

    public void setFirstAuthorClass(String firstAuthorClass) {
        this.firstAuthorClass = firstAuthorClass;
    }

    public String getFirstAuthorEmail() {
        return firstAuthorEmail;
    }

    public void setFirstAuthorEmail(String firstAuthorEmail) {
        this.firstAuthorEmail = firstAuthorEmail;
    }

    public String getFirstAuthorTelephoneNumber() {
        return firstAuthorTelephoneNumber;
    }

    public void setFirstAuthorTelephoneNumber(String firstAuthorTelephoneNumber) {
        this.firstAuthorTelephoneNumber = firstAuthorTelephoneNumber;
    }

    public String getSecondAuthorName() {
        return secondAuthorName;
    }

    public void setSecondAuthorName(String secondAuthorName) {
        this.secondAuthorName = secondAuthorName;
    }

    public String getSecondAuthorClass() {
        return secondAuthorClass;
    }

    public void setSecondAuthorClass(String secondAuthorClass) {
        this.secondAuthorClass = secondAuthorClass;
    }

    public String getSecondAuthorEmail() {
        return secondAuthorEmail;
    }

    public void setSecondAuthorEmail(String secondAuthorEmail) {
        this.secondAuthorEmail = secondAuthorEmail;
    }

    public String getSecondAuthorTelephoneNumber() {
        return secondAuthorTelephoneNumber;
    }

    public void setSecondAuthorTelephoneNumber(String secondAuthorTelephoneNumber) {
        this.secondAuthorTelephoneNumber = secondAuthorTelephoneNumber;
    }

    public String getThirdAuthorName() {
        return thirdAuthorName;
    }

    public void setThirdAuthorName(String thirdAuthorName) {
        this.thirdAuthorName = thirdAuthorName;
    }

    public String getThirdAuthorClass() {
        return thirdAuthorClass;
    }

    public void setThirdAuthorClass(String thirdAuthorClass) {
        this.thirdAuthorClass = thirdAuthorClass;
    }

    public String getThirdAuthorEmail() {
        return thirdAuthorEmail;
    }

    public void setThirdAuthorEmail(String thirdAuthorEmail) {
        this.thirdAuthorEmail = thirdAuthorEmail;
    }

    public String getThirdAuthorTelephoneNumber() {
        return thirdAuthorTelephoneNumber;
    }

    public void setThirdAuthorTelephoneNumber(String thirdAuthorTelephoneNumber) {
        this.thirdAuthorTelephoneNumber = thirdAuthorTelephoneNumber;
    }
}
