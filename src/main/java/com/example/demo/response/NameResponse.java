package com.example.demo.response;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Name")
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class NameResponse {
    private String fullName;

    @XmlAttribute(name = "FullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName(){
        return this.fullName;
    }
}
