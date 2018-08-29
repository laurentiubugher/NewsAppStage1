package com.example.lauru.newsappstage1;
/**
 * An {@link New} object contains information related to a single new.
 */
public class New {

    /** Section name */
    private String mSectionName;

    /** Title of the new */
    private String mTitle;

    /** Date of the new */
    private String mDate;

    /** Name of the author */
    private String mAuthor;

    /** Website URL of the new */
    private String mUrl;

    /**
     * Constructs a new {@link New} object.
     * @param SectionName
     * @param Title
     * @param Date
     * @param Author
     */
    public New(String SectionName, String Title, String Date, String Author, String url) {
        mSectionName = SectionName;
        mTitle = Title;
        mDate = Date;
        mAuthor = Author;
        mUrl = url;
    }

    /**
     * Returns the section name of the new.
     */
    public String getSectionName() {
        return mSectionName;
    }

    /**
     * Returns the title of the new.
     */
    public String getTitle() {
        return mTitle;
    }
    /**
     * Returns the author of the new.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the date of the new.
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Returns the website URL to find more information about the new.
     */
    public String getUrl() {
        return mUrl;
    }
}

