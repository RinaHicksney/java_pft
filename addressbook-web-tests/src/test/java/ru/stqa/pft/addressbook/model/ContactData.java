package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String middle_name;
    private final String last_name;
    private final String nick_name;
    private final String title;
    private final String company;
    private final String address;
    private final String hOme;
    private final String mobile;
    private final String work;
    private final String fax;
    private final String email;
    private final String email2;
    private final String email3;
    private final String homepage;

    public ContactData(String firstname, String middle_name, String last_name, String nick_name, String title, String company, String address, String hOme, String mobile, String work, String fax, String email, String email2, String email3, String homepage) {
        this.firstname = firstname;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.nick_name = nick_name;
        this.title = title;
        this.company = company;
        this.address = address;
        this.hOme = hOme;
        this.mobile = mobile;
        this.work = work;
        this.fax = fax;
        this.email = email;
        this.email2 = email2;
        this.email3 = email3;
        this.homepage = homepage;
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
}
