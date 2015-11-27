package com.holmesycl.product.util;

import com.google.common.base.Preconditions;

public final class SqlUtil {

	public static String LIKE = "%";

	public static String bothLike(String param) {
		param = Preconditions.checkNotNull(param);
		return LIKE + param + LIKE;
	}

}
