package com.employee.model;

import javax.persistence.*;
import org.openxava.annotations.*;
 
@MappedSuperclass // Marked as mapped superclass instead of entity
public class Identifiable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Hidden
	@Column(name="id")
	private long oid;
	
    public long getOid() {
        return oid;
    }
 
    public void setOid(long oid) {
        this.oid = oid;
    }
 
}
