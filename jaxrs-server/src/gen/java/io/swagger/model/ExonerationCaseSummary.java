package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-29T20:39:44.895Z")
public class ExonerationCaseSummary   {
  
  private BigDecimal caseID = null;
  private String firstName = null;
  private String lastName = null;
  private String state = null;
  private String dateOfExoneration = null;
  private String postingDate = null;
  private String featureDescription = null;
  private String linkToImage = null;
  private String linkToThumbnail = null;

  
  /**
   * Case ID.
   **/
  public ExonerationCaseSummary caseID(BigDecimal caseID) {
    this.caseID = caseID;
    return this;
  }

  
  @ApiModelProperty(value = "Case ID.")
  @JsonProperty("CaseID")
  public BigDecimal getCaseID() {
    return caseID;
  }
  public void setCaseID(BigDecimal caseID) {
    this.caseID = caseID;
  }

  
  /**
   * First name of the Exoneree.
   **/
  public ExonerationCaseSummary firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  
  @ApiModelProperty(value = "First name of the Exoneree.")
  @JsonProperty("FirstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * Last name of the Exoneree.
   **/
  public ExonerationCaseSummary lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  
  @ApiModelProperty(value = "Last name of the Exoneree.")
  @JsonProperty("LastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * State.
   **/
  public ExonerationCaseSummary state(String state) {
    this.state = state;
    return this;
  }

  
  @ApiModelProperty(value = "State.")
  @JsonProperty("State")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   * Date Of Exoneration.
   **/
  public ExonerationCaseSummary dateOfExoneration(String dateOfExoneration) {
    this.dateOfExoneration = dateOfExoneration;
    return this;
  }

  
  @ApiModelProperty(value = "Date Of Exoneration.")
  @JsonProperty("DateOfExoneration")
  public String getDateOfExoneration() {
    return dateOfExoneration;
  }
  public void setDateOfExoneration(String dateOfExoneration) {
    this.dateOfExoneration = dateOfExoneration;
  }

  
  /**
   * Posting Date.
   **/
  public ExonerationCaseSummary postingDate(String postingDate) {
    this.postingDate = postingDate;
    return this;
  }

  
  @ApiModelProperty(value = "Posting Date.")
  @JsonProperty("PostingDate")
  public String getPostingDate() {
    return postingDate;
  }
  public void setPostingDate(String postingDate) {
    this.postingDate = postingDate;
  }

  
  /**
   * Feature Description.
   **/
  public ExonerationCaseSummary featureDescription(String featureDescription) {
    this.featureDescription = featureDescription;
    return this;
  }

  
  @ApiModelProperty(value = "Feature Description.")
  @JsonProperty("FeatureDescription")
  public String getFeatureDescription() {
    return featureDescription;
  }
  public void setFeatureDescription(String featureDescription) {
    this.featureDescription = featureDescription;
  }

  
  /**
   * Link To Image.
   **/
  public ExonerationCaseSummary linkToImage(String linkToImage) {
    this.linkToImage = linkToImage;
    return this;
  }

  
  @ApiModelProperty(value = "Link To Image.")
  @JsonProperty("LinkToImage")
  public String getLinkToImage() {
    return linkToImage;
  }
  public void setLinkToImage(String linkToImage) {
    this.linkToImage = linkToImage;
  }

  
  /**
   * Link To Thumbnail.
   **/
  public ExonerationCaseSummary linkToThumbnail(String linkToThumbnail) {
    this.linkToThumbnail = linkToThumbnail;
    return this;
  }

  
  @ApiModelProperty(value = "Link To Thumbnail.")
  @JsonProperty("LinkToThumbnail")
  public String getLinkToThumbnail() {
    return linkToThumbnail;
  }
  public void setLinkToThumbnail(String linkToThumbnail) {
    this.linkToThumbnail = linkToThumbnail;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExonerationCaseSummary exonerationCaseSummary = (ExonerationCaseSummary) o;
    return Objects.equals(caseID, exonerationCaseSummary.caseID) &&
        Objects.equals(firstName, exonerationCaseSummary.firstName) &&
        Objects.equals(lastName, exonerationCaseSummary.lastName) &&
        Objects.equals(state, exonerationCaseSummary.state) &&
        Objects.equals(dateOfExoneration, exonerationCaseSummary.dateOfExoneration) &&
        Objects.equals(postingDate, exonerationCaseSummary.postingDate) &&
        Objects.equals(featureDescription, exonerationCaseSummary.featureDescription) &&
        Objects.equals(linkToImage, exonerationCaseSummary.linkToImage) &&
        Objects.equals(linkToThumbnail, exonerationCaseSummary.linkToThumbnail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseID, firstName, lastName, state, dateOfExoneration, postingDate, featureDescription, linkToImage, linkToThumbnail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExonerationCaseSummary {\n");
    
    sb.append("    caseID: ").append(toIndentedString(caseID)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dateOfExoneration: ").append(toIndentedString(dateOfExoneration)).append("\n");
    sb.append("    postingDate: ").append(toIndentedString(postingDate)).append("\n");
    sb.append("    featureDescription: ").append(toIndentedString(featureDescription)).append("\n");
    sb.append("    linkToImage: ").append(toIndentedString(linkToImage)).append("\n");
    sb.append("    linkToThumbnail: ").append(toIndentedString(linkToThumbnail)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

