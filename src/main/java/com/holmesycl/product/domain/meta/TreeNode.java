package com.holmesycl.product.domain.meta;

import java.io.Serializable;
import java.util.List;

/**
 * 树节点
 * 
 * @author yecl
 *
 */
public class TreeNode implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1120227764009615669L;

	/**
	 * The text value displayed for a given tree node, typically to the right of
	 * the nodes icon.
	 */
	private String text;

	/**
	 * 节点值
	 */
	private String value;

	/**
	 * The icon displayed on a given node, typically to the left of the text.
	 */
	private String icon;

	/**
	 * The icon displayed on a given node when selected, typically to the left
	 * of the text.
	 */
	private String selectedIcon;

	/**
	 * The foreground color used on a given node, overrides global color option.
	 */
	private String color;

	/**
	 * The background color used on a given node, overrides global color option.
	 */
	private String backColor;

	/**
	 * Used in conjunction with global enableLinks option to specify anchor tag
	 * URL on a given node.
	 */
	private String href;

	/**
	 * Whether or not a node is selectable in the tree. False indicates the node
	 * should act as an expansion heading and will not fire selection events.
	 */
	private Boolean selectable = true;

	/**
	 * Describes a node's initial state.
	 */
	private State state;

	public static class State {

		/**
		 * Whether or not a node is checked, represented by a checkbox style
		 * glyphicon.
		 */
		private Boolean checked;

		/**
		 * Whether or not a node is disabled (not selectable, expandable or
		 * checkable).
		 */
		private Boolean disabled;

		/**
		 * Whether or not a node is expanded i.e. open. Takes precedence over
		 * global option levels.
		 */
		private Boolean expanded;

		/**
		 * Whether or not a node is selected.
		 */
		private Boolean selected;

		public Boolean getChecked() {
			return checked;
		}

		public void setChecked(Boolean checked) {
			this.checked = checked;
		}

		public Boolean getDisabled() {
			return disabled;
		}

		public void setDisabled(Boolean disabled) {
			this.disabled = disabled;
		}

		public Boolean getExpanded() {
			return expanded;
		}

		public void setExpanded(Boolean expanded) {
			this.expanded = expanded;
		}

		public Boolean getSelected() {
			return selected;
		}

		public void setSelected(Boolean selected) {
			this.selected = selected;
		}
	}

	/**
	 * Used in conjunction with global showTags option to add additional
	 * information to the right of each node.
	 */
	private List<String> tags;

	/**
	 * 子节点
	 */
	private List<TreeNode> nodes;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getSelectedIcon() {
		return selectedIcon;
	}

	public void setSelectedIcon(String selectedIcon) {
		this.selectedIcon = selectedIcon;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBackColor() {
		return backColor;
	}

	public void setBackColor(String backColor) {
		this.backColor = backColor;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public Boolean getSelectable() {
		return selectable;
	}

	public void setSelectable(Boolean selectable) {
		this.selectable = selectable;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<TreeNode> getNodes() {
		return nodes;
	}

	public void setNodes(List<TreeNode> nodes) {
		this.nodes = nodes;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
