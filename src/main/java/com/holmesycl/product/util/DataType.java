package com.holmesycl.product.util;

import com.google.common.base.Preconditions;

public enum DataType {

	DATE {
		@Override
		public String toOrginName() {
			return "Date";
		}

		@Override
		public String toLocalString() {
			return "日期";
		}
	},
	INTEGER {
		@Override
		public String toOrginName() {
			return "Integer";
		}

		@Override
		public String toLocalString() {
			return "数字";
		}
	},
	LIST {
		@Override
		public String toOrginName() {
			return "List";
		}

		@Override
		public String toLocalString() {
			return "对象列表";
		}
	},
	OBJECT {
		@Override
		public String toOrginName() {
			return "Object";
		}

		@Override
		public String toLocalString() {
			return "对象";
		}
	},
	STRING {
		@Override
		public String toOrginName() {
			return "String";
		}

		@Override
		public String toLocalString() {
			return "字符";
		}
	};

	public abstract String toOrginName();

	public abstract String toLocalString();

	public static DataType createByOrginName(String orginName) {
		orginName = Preconditions.checkNotNull(orginName).trim();
		DataType[] values = values();
		for (DataType value : values) {
			if (value.toOrginName().equals(orginName)) {
				return value;
			}
		}
		return null;
	}

}
