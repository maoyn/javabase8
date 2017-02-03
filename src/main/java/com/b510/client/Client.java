/**
 *
 */
package com.b510.client;

import com.b510.excel.SaveData2DB;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Hongten
 * @created 2014-5-21
 */
public class Client {

	public static void main(String[] args) throws IOException {

		SaveData2DB saveData2DB = new SaveData2DB();
		try {
			saveData2DB.save();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("end");
}
}