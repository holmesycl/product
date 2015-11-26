package com.holmesycl.product.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class TagsUtil {

	public static List<String> createTags(String... tags) {
		List<String> tagList = new ArrayList<String>();
		Collections.addAll(tagList, tags);
		return tagList;
	}
}
