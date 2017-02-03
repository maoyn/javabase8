/**
 * 
 */
package com.b510.excel;

import com.b510.common.Common;
import com.b510.excel.util.Util;
import com.b510.excel.vo.Student;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Hongten
 * @created 2014-5-18
 */
public class SaveData2DB {

	@SuppressWarnings({ "rawtypes" })
	public void save() throws IOException, SQLException {
		String excel2003_2007 = Common.STUDENT_INFO_XLS_PATH;
		String excel2010 = Common.STUDENT_INFO_XLSX_PATH;

		Student student = null;
		List<Student> list = new ReadExcel().readExcel(excel2003_2007);

		for (int i = 0; i < list.size(); i++) {
			student = list.get(i);
			List l = Util.selectOne(Common.SELECT_STUDENT_SQL + "'%" + student.getName() + "%'", student);
			if (!l.contains(1)) {
				Util.insert(Common.INSERT_STUDENT_SQL, student);
			} else {
				System.out.println("The Record was Exist : No. = " + student.getNo() + " , Name = " + student.getName() + ", Age = " + student.getAge() + ", and has been throw away!");
			}
		}
	}
}
