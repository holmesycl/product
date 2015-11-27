package com.holmesycl.product.util;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.CaseFormat;
import com.google.common.base.Preconditions;

public final class ClassPathUtil {

	public static String DOT = ".";

	public static String DEFAULT_LAST = "Bean";

	public static String toUpperCaseTableName(String classPath) {
		classPath = Preconditions.checkNotNull(classPath);
		String simpleName = StringUtils.substringAfterLast(classPath, DOT);
		return CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, simpleName);
	}

	public static String toUpperCaseTableNameHasLast(String classPath) {
		classPath = Preconditions.checkNotNull(classPath);
		String simpleName = StringUtils.substringAfterLast(classPath, DOT);
		simpleName = StringUtils.substringBeforeLast(simpleName, DEFAULT_LAST);
		return CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, simpleName);
	}

}
