package com.example.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

//Entityとは: DBに登録・更新する値を入れておく。DBから取得した値を保持しておく。
@Entity
@Table(name="bookdata")
public class BookData {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) //主キー
	@Column
	private long id;
	
	@Column(length = 40, nullable = false) //length:カラムの長さ  nullable:null値を設定できるか
	private String isbn;
	
	@Column(length=10, nullable=false)
	private String genre;
	
	@Column(length=20, nullable=false)
	private String author;
	
	@Column(length=20, nullable=false)
	private String title;
	
	@Column
	@Min(value=0)
	@Max(value=100)
	private int stock;
	
	private Boolean status;
}
