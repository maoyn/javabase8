/**
 *
 */
package com.b510.common;

/**
 * @author Hongten
 * @created 2014-5-21
 */
public class Common {

	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DB_NAME = "maotest";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "123456";
	public static final String IP = "localhost";
	public static final String PORT = "3306";
	public static final String URL = "jdbc:mysql://" + IP + ":" + PORT + "/" + DB_NAME;


	public static final String OFFICE_EXCEL_2003_POSTFIX = "xls";
	public static final String OFFICE_EXCEL_2010_POSTFIX = "xlsx";

	public static final String EMPTY = "";
	public static final String POINT = ".";
	public static final String LIB_PATH = "lib";
	public static final String STUDENT_INFO_XLS_PATH = LIB_PATH + "/student_info" + POINT + OFFICE_EXCEL_2003_POSTFIX;
	public static final String STUDENT_INFO_XLSX_PATH = LIB_PATH + "/student" + POINT + OFFICE_EXCEL_2010_POSTFIX;
	public static final String NOT_EXCEL_FILE = " : Not the Excel file!";
	public static final String PROCESSING = "Processing...";

	// sql
	public static final String INSERT_STUDENT_SQL = "insert into student_info(no, name, age, score) values(?, ?, ?, ?)";
	public static final String UPDATE_STUDENT_SQL = "update student_info set no = ?, name = ?, age= ?, score = ? where id = ? ";
	public static final String SELECT_STUDENT_ALL_SQL = "select id,no,name,age,score from student_info";
	public static final String SELECT_STUDENT_SQL = "select * from student_info where name like ";
}

