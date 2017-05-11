/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Tag {

    public Tag(String name, String Id, String description, Boolean has_class_Tag) {
        this.name = name;
        this.Id = Id;
        this.description = description;
        this.has_class_Tag = has_class_Tag;
    }
   
    private String name;
    private String Id;
    private String description;
    private Boolean has_class_Tag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getHas_class_Tag() {
        return has_class_Tag;
    }

    public void setHas_class_Tag(Boolean has_class_Tag) {
        this.has_class_Tag = has_class_Tag;
    }

    
    
}
