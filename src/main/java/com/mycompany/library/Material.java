
package com.mycompany.library;

public class Material {
    private String code;
    private String title;
    private String yearPublic;

    public Material() {
    }

    public Material(String code, String title, String yearPublic) {
        this.code = code;
        this.title = title;
        this.yearPublic = yearPublic;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYearPublic() {
        return yearPublic;
    }

    public void setYearPublic(String yearPublic) {
        this.yearPublic = yearPublic;
    }
    
    
}
