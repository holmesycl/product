package com.holmesycl.product.util;

import com.google.common.base.Preconditions;

/**
 * 构件类型
 * 
 * @author yecl
 *
 */
public enum ComponentType {

	TAB {
		@Override
		public String toLocalString() {
			return "标签";
		}

		@Override
		public String toOrginName() {
			return "Tab";
		}
	},
	TAB_ITEM {
		@Override
		public String toLocalString() {
			return "标签项";
		}

		@Override
		public String toOrginName() {
			return "TabItem";
		}
	},
	FORM {
		@Override
		public String toLocalString() {
			return "表单";
		}

		@Override
		public String toOrginName() {
			return "Form";
		}
	},
	TABLE {
		@Override
		public String toLocalString() {
			return "表格";
		}

		@Override
		public String toOrginName() {
			return "Table";
		}
	},
	COMPOSE1 {
		@Override
		public String toLocalString() {
			return "左右分屏标签";
		}

		@Override
		public String toOrginName() {
			return "Compose1";
		}
	},
	ZERO {
		@Override
		public String toLocalString() {
			return "输入框";
		}

		@Override
		public String toOrginName() {
			return "0";
		}
	},
	ONE {
		@Override
		public String toLocalString() {
			return "下拉框";
		}

		@Override
		public String toOrginName() {
			return "1";
		}
	},
	TWO {
		@Override
		public String toLocalString() {
			return "时间控件";
		}

		@Override
		public String toOrginName() {
			return "2";
		}
	},
	EIGHT {
		@Override
		public String toLocalString() {
			return "查询框";
		}

		@Override
		public String toOrginName() {
			return "8";
		}
	},
	NINE {
		@Override
		public String toLocalString() {
			return "多行输入框";
		}

		@Override
		public String toOrginName() {
			return "9";
		}
	},
	AUXILIARY {
		@Override
		public String toLocalString() {
			return "辅助控件";
		}

		@Override
		public String toOrginName() {
			return "Auxiliary";
		}
	};

	public abstract String toLocalString();

	public abstract String toOrginName();

	public static ComponentType createByOrginName(String orginName) {
		orginName = Preconditions.checkNotNull(orginName).trim();
		ComponentType[] values = values();
		for (ComponentType value : values) {
			if (value.toOrginName().equals(orginName)) {
				return value;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		ComponentType.createByOrginName(null);
	}
}
