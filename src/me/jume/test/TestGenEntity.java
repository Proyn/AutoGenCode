package me.jume.test;

import me.jume.util.GenEntityMysqlUtil;

public class TestGenEntity {
	public static void main(String[] args) {
		String packagePath = "me.jume.util.Account";
		String tableName = "account";
		GenEntityMysqlUtil.genEntity(packagePath, tableName);
	}
}
