package io.jpress.module.product.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jboot.db.model.JbootModel;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProduct<M extends BaseProduct<M>> extends JbootModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setSlug(java.lang.String slug) {
		set("slug", slug);
	}
	
	public java.lang.String getSlug() {
		return getStr("slug");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}
	
	public java.lang.String getContent() {
		return getStr("content");
	}

	public void setSummary(java.lang.String summary) {
		set("summary", summary);
	}
	
	public java.lang.String getSummary() {
		return getStr("summary");
	}

	public void setThumbnail(java.lang.String thumbnail) {
		set("thumbnail", thumbnail);
	}
	
	public java.lang.String getThumbnail() {
		return getStr("thumbnail");
	}

	public void setVideo(java.lang.String video) {
		set("video", video);
	}
	
	public java.lang.String getVideo() {
		return getStr("video");
	}

	public void setStyle(java.lang.String style) {
		set("style", style);
	}
	
	public java.lang.String getStyle() {
		return getStr("style");
	}

	public void setOrderNumber(java.lang.Integer orderNumber) {
		set("order_number", orderNumber);
	}
	
	public java.lang.Integer getOrderNumber() {
		return getInt("order_number");
	}

	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}
	
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

	public void setUserDivideType(java.lang.Integer userDivideType) {
		set("user_divide_type", userDivideType);
	}
	
	public java.lang.Integer getUserDivideType() {
		return getInt("user_divide_type");
	}

	public void setUserDivideRatio(java.lang.Integer userDivideRatio) {
		set("user_divide_ratio", userDivideRatio);
	}
	
	public java.lang.Integer getUserDivideRatio() {
		return getInt("user_divide_ratio");
	}

	public void setPrice(java.lang.Integer price) {
		set("price", price);
	}
	
	public java.lang.Integer getPrice() {
		return getInt("price");
	}

	public void setOriginPrice(java.lang.Integer originPrice) {
		set("origin_price", originPrice);
	}
	
	public java.lang.Integer getOriginPrice() {
		return getInt("origin_price");
	}

	public void setLimitedPrice(java.lang.Integer limitedPrice) {
		set("limited_price", limitedPrice);
	}
	
	public java.lang.Integer getLimitedPrice() {
		return getInt("limited_price");
	}

	public void setLimitedTime(java.util.Date limitedTime) {
		set("limited_time", limitedTime);
	}
	
	public java.util.Date getLimitedTime() {
		return get("limited_time");
	}

	public void setDistEnable(java.lang.Boolean distEnable) {
		set("dist_enable", distEnable);
	}
	
	public java.lang.Boolean getDistEnable() {
		return get("dist_enable");
	}

	public void setDistPrice(java.lang.Integer distPrice) {
		set("dist_price", distPrice);
	}
	
	public java.lang.Integer getDistPrice() {
		return getInt("dist_price");
	}

	public void setStatus(java.lang.String status) {
		set("status", status);
	}
	
	public java.lang.String getStatus() {
		return getStr("status");
	}

	public void setCommentStatus(java.lang.Boolean commentStatus) {
		set("comment_status", commentStatus);
	}
	
	public java.lang.Boolean getCommentStatus() {
		return get("comment_status");
	}

	public void setCommentCount(java.lang.Long commentCount) {
		set("comment_count", commentCount);
	}
	
	public java.lang.Long getCommentCount() {
		return getLong("comment_count");
	}

	public void setCommentTime(java.util.Date commentTime) {
		set("comment_time", commentTime);
	}
	
	public java.util.Date getCommentTime() {
		return get("comment_time");
	}

	public void setViewCount(java.lang.Long viewCount) {
		set("view_count", viewCount);
	}
	
	public java.lang.Long getViewCount() {
		return getLong("view_count");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}
	
	public java.util.Date getCreated() {
		return get("created");
	}

	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}
	
	public java.util.Date getModified() {
		return get("modified");
	}

	public void setFlag(java.lang.String flag) {
		set("flag", flag);
	}
	
	public java.lang.String getFlag() {
		return getStr("flag");
	}

	public void setMetaKeywords(java.lang.String metaKeywords) {
		set("meta_keywords", metaKeywords);
	}
	
	public java.lang.String getMetaKeywords() {
		return getStr("meta_keywords");
	}

	public void setMetaDescription(java.lang.String metaDescription) {
		set("meta_description", metaDescription);
	}
	
	public java.lang.String getMetaDescription() {
		return getStr("meta_description");
	}

	public void setRemarks(java.lang.String remarks) {
		set("remarks", remarks);
	}
	
	public java.lang.String getRemarks() {
		return getStr("remarks");
	}

}