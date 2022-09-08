package com.affinity.efasample_arabic.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class TermsAndConditions extends BaseResponse{

    @SerializedName("data")
    @Expose
    private ArrayList<TermsAndConditionContent> termsAndConditionContents;

    public ArrayList<TermsAndConditionContent> getTermsAndConditionContents() {
        return termsAndConditionContents;
    }

    public void setTermsAndConditionContents(ArrayList<TermsAndConditionContent> termsAndConditionContents) {
        this.termsAndConditionContents = termsAndConditionContents;
    }
}
