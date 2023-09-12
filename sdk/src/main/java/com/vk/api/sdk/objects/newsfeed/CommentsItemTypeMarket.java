// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.Likes;
import com.vk.api.sdk.objects.market.MarketCategory;
import com.vk.api.sdk.objects.market.MarketItemAvailability;
import com.vk.api.sdk.objects.market.Price;
import java.net.URI;
import java.util.Objects;

/**
 * CommentsItemTypeMarket object
 */
public class CommentsItemTypeMarket extends CommentsItemBase implements Validable {
    /**
     * Access key for the market item
     */
    @SerializedName("access_key")
    private String accessKey;

    @SerializedName("availability")
    @Required
    private MarketItemAvailability availability;

    /**
     * Title for button for url
     */
    @SerializedName("button_title")
    private String buttonTitle;

    @SerializedName("category")
    @Required
    private MarketCategory category;

    @SerializedName("category_v2")
    private MarketCategory categoryV2;

    @SerializedName("comments")
    private CommentsBase comments;

    /**
     * Item description
     */
    @SerializedName("description")
    @Required
    private String description;

    @SerializedName("external_id")
    private String externalId;

    /**
     * Item ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    @SerializedName("is_adult")
    private Boolean isAdult;

    @SerializedName("is_favorite")
    private Boolean isFavorite;

    @SerializedName("is_main_variant")
    private Boolean isMainVariant;

    @SerializedName("is_owner")
    private Boolean isOwner;

    @SerializedName("likes")
    private Likes likes;

    /**
     * Item owner's ID
     * Entity: owner
     */
    @SerializedName("owner_id")
    @Required
    private Long ownerId;

    /**
     * Attach for post owner id
     * Entity: owner
     */
    @SerializedName("post_owner_id")
    private Long postOwnerId;

    @SerializedName("price")
    @Required
    private Price price;

    @SerializedName("sku")
    private String sku;

    /**
     * Inventory balances
     */
    @SerializedName("stock_amount")
    private Integer stockAmount;

    /**
     * URL of the preview image
     */
    @SerializedName("thumb_photo")
    private URI thumbPhoto;

    /**
     * Item title
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * URL to item
     */
    @SerializedName("url")
    private String url;

    @SerializedName("variants_grouping_id")
    private Integer variantsGroupingId;

    public String getAccessKey() {
        return accessKey;
    }

    public CommentsItemTypeMarket setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public MarketItemAvailability getAvailability() {
        return availability;
    }

    public CommentsItemTypeMarket setAvailability(MarketItemAvailability availability) {
        this.availability = availability;
        return this;
    }

    public String getButtonTitle() {
        return buttonTitle;
    }

    public CommentsItemTypeMarket setButtonTitle(String buttonTitle) {
        this.buttonTitle = buttonTitle;
        return this;
    }

    public MarketCategory getCategory() {
        return category;
    }

    public CommentsItemTypeMarket setCategory(MarketCategory category) {
        this.category = category;
        return this;
    }

    public MarketCategory getCategoryV2() {
        return categoryV2;
    }

    public CommentsItemTypeMarket setCategoryV2(MarketCategory categoryV2) {
        this.categoryV2 = categoryV2;
        return this;
    }

    public CommentsBase getComments() {
        return comments;
    }

    public CommentsItemTypeMarket setComments(CommentsBase comments) {
        this.comments = comments;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CommentsItemTypeMarket setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public CommentsItemTypeMarket setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public CommentsItemTypeMarket setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getIsAdult() {
        return isAdult;
    }

    public CommentsItemTypeMarket setIsAdult(Boolean isAdult) {
        this.isAdult = isAdult;
        return this;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public CommentsItemTypeMarket setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    public Boolean getIsMainVariant() {
        return isMainVariant;
    }

    public CommentsItemTypeMarket setIsMainVariant(Boolean isMainVariant) {
        this.isMainVariant = isMainVariant;
        return this;
    }

    public Boolean getIsOwner() {
        return isOwner;
    }

    public CommentsItemTypeMarket setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
        return this;
    }

    public Likes getLikes() {
        return likes;
    }

    public CommentsItemTypeMarket setLikes(Likes likes) {
        this.likes = likes;
        return this;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public CommentsItemTypeMarket setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Long getPostOwnerId() {
        return postOwnerId;
    }

    public CommentsItemTypeMarket setPostOwnerId(Long postOwnerId) {
        this.postOwnerId = postOwnerId;
        return this;
    }

    public Price getPrice() {
        return price;
    }

    public CommentsItemTypeMarket setPrice(Price price) {
        this.price = price;
        return this;
    }

    public String getSku() {
        return sku;
    }

    public CommentsItemTypeMarket setSku(String sku) {
        this.sku = sku;
        return this;
    }

    public Integer getStockAmount() {
        return stockAmount;
    }

    public CommentsItemTypeMarket setStockAmount(Integer stockAmount) {
        this.stockAmount = stockAmount;
        return this;
    }

    public URI getThumbPhoto() {
        return thumbPhoto;
    }

    public CommentsItemTypeMarket setThumbPhoto(URI thumbPhoto) {
        this.thumbPhoto = thumbPhoto;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public CommentsItemTypeMarket setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public CommentsItemTypeMarket setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getVariantsGroupingId() {
        return variantsGroupingId;
    }

    public CommentsItemTypeMarket setVariantsGroupingId(Integer variantsGroupingId) {
        this.variantsGroupingId = variantsGroupingId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(variantsGroupingId, comments, thumbPhoto, buttonTitle, postOwnerId, description, externalId, availability, ownerId, title, url, stockAmount, isMainVariant, isOwner, accessKey, price, id, category, sku, categoryV2, isAdult, isFavorite, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentsItemTypeMarket commentsItemTypeMarket = (CommentsItemTypeMarket) o;
        return Objects.equals(comments, commentsItemTypeMarket.comments) &&
                Objects.equals(isFavorite, commentsItemTypeMarket.isFavorite) &&
                Objects.equals(stockAmount, commentsItemTypeMarket.stockAmount) &&
                Objects.equals(postOwnerId, commentsItemTypeMarket.postOwnerId) &&
                Objects.equals(isOwner, commentsItemTypeMarket.isOwner) &&
                Objects.equals(ownerId, commentsItemTypeMarket.ownerId) &&
                Objects.equals(description, commentsItemTypeMarket.description) &&
                Objects.equals(externalId, commentsItemTypeMarket.externalId) &&
                Objects.equals(isMainVariant, commentsItemTypeMarket.isMainVariant) &&
                Objects.equals(availability, commentsItemTypeMarket.availability) &&
                Objects.equals(title, commentsItemTypeMarket.title) &&
                Objects.equals(url, commentsItemTypeMarket.url) &&
                Objects.equals(isAdult, commentsItemTypeMarket.isAdult) &&
                Objects.equals(thumbPhoto, commentsItemTypeMarket.thumbPhoto) &&
                Objects.equals(variantsGroupingId, commentsItemTypeMarket.variantsGroupingId) &&
                Objects.equals(categoryV2, commentsItemTypeMarket.categoryV2) &&
                Objects.equals(price, commentsItemTypeMarket.price) &&
                Objects.equals(accessKey, commentsItemTypeMarket.accessKey) &&
                Objects.equals(buttonTitle, commentsItemTypeMarket.buttonTitle) &&
                Objects.equals(id, commentsItemTypeMarket.id) &&
                Objects.equals(category, commentsItemTypeMarket.category) &&
                Objects.equals(sku, commentsItemTypeMarket.sku) &&
                Objects.equals(likes, commentsItemTypeMarket.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CommentsItemTypeMarket{");
        sb.append("comments=").append(comments);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", stockAmount=").append(stockAmount);
        sb.append(", postOwnerId=").append(postOwnerId);
        sb.append(", isOwner=").append(isOwner);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", description='").append(description).append("'");
        sb.append(", externalId='").append(externalId).append("'");
        sb.append(", isMainVariant=").append(isMainVariant);
        sb.append(", availability=").append(availability);
        sb.append(", title='").append(title).append("'");
        sb.append(", url='").append(url).append("'");
        sb.append(", isAdult=").append(isAdult);
        sb.append(", thumbPhoto=").append(thumbPhoto);
        sb.append(", variantsGroupingId=").append(variantsGroupingId);
        sb.append(", categoryV2=").append(categoryV2);
        sb.append(", price=").append(price);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", buttonTitle='").append(buttonTitle).append("'");
        sb.append(", id=").append(id);
        sb.append(", category=").append(category);
        sb.append(", sku='").append(sku).append("'");
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}