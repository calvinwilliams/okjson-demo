package xyz.calvinwilliams.demo;

import java.time.LocalDate;
import java.time.LocalTime;

import xyz.calvinwilliams.okjson.OkJsonDateTimeFormatter;

public class DemoUserBorrowDetail {
	String				bookName ;
	String				author ;
	@OkJsonDateTimeFormatter(format="yyyy-MM-dd")
	LocalDate			borrowDate ;
	@OkJsonDateTimeFormatter(format="HH:mm:ss")
	LocalTime			borrowTime ;
}
