// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Sort order: '1' — by date registered, '0' — by rating
 */
public enum SearchSort implements EnumParam {
    @SerializedName("0")
    BY_RATING(0),

    @SerializedName("1")
    BY_DATE_REGISTERED(1);

    private final Integer value;

    SearchSort(Integer value) {
        this.value = value;
    }

    public String getValue() {
        return value.toString();
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}