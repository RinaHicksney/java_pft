package ru.stqa.pft.addressbook.model;


import java.util.Objects;

public class ContactData {
    private int id = Integer.MAX_VALUE;;
    private String firstname;
    private String middle_name;
    private String last_name;
    private String nick_name;
    private String title;
    private String company;
    private String address;
    private String hOme;
    private String mobile;
    private String work;
    private String fax;
    private String email;
    private String email2;
    private String email3;
    private String homepage;
    private String group;

    public ContactData withId(int id){
        this.id = id;
        return  this;
    }

    public ContactData withFirstName(String firstname){
        this.firstname = firstname;
        return  this;
    }
    public ContactData withMiddle_Name(String middle_name){
        this.middle_name = middle_name;
        return  this;
    }
    public ContactData withLast_Name(String last_name){
        this.last_name = last_name;
        return  this;
    }
    public ContactData withNick_Name(String nick_name){
        this.nick_name = nick_name;
        return  this;
    }
    public ContactData withTitle(String title){
        this.title = title;
        return  this;
    }
    public ContactData withCompany(String company){
        this.company = company;
        return  this;
    }
    public ContactData withAddress(String address){
        this.address = address;
        return  this;
    }
    public ContactData withHome(String hOme){
        this.hOme = hOme;
        return  this;
    }
    public ContactData withMobile(String mobile){
        this.mobile = mobile;
        return  this;
    }
    public ContactData withWork(String work){
        this.work = work;
        return  this;
    }
    public ContactData withFax(String fax){
        this.fax = fax;
        return  this;
    }public ContactData withEmail(String email){
        this.email = email;
        return  this;
    }public ContactData withEmail2(String email2){
        this.email2 = email2;
        return  this;
    }public ContactData withEmail3(String email3){
        this.email3 = email3;
        return  this;
    }public ContactData withHomepage(String homepage){
        this.homepage = homepage;
        return  this;
    }
    public ContactData withGroup(String group){
        this.group = group;
        return  this;
    }


    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return id == that.id &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(last_name, that.last_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, last_name);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getNick_name() {
        return nick_name;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String gethOme() {
        return hOme;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWork() {
        return work;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail2() {
        return email2;
    }

    public String getEmail3() {
        return email3;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getGroup() { return group; }
}
