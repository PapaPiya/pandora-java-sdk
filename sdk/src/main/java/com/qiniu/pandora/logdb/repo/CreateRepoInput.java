package com.qiniu.pandora.logdb.repo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jemy on 2018/6/11.
 */
public class CreateRepoInput {
    @SerializedName("region")
    public String region;
    @SerializedName("retention")
    public String retention;
    @SerializedName("schema")
    public RepoSchemaEntry[] schema;
    @SerializedName("primaryField")
    public String primaryField;
    @SerializedName("fullText")
    public FullText fullText;
    @SerializedName("description")
    public String description;
}
