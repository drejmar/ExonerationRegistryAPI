package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-29T20:39:44.895Z")
public class ExonerationCaseDetail   {
  
  private BigDecimal caseID = null;
  private String firstName = null;
  private String lastName = null;
  private String linkToImage = null;
  private String linkToThumbnail = null;
  private String photoByline = null;
  private String state = null;
  private String county = null;
  private String mostSeriousCrime = null;
  private String additionalConvictions = null;
  private String reportedCrimeDate = null;
  private String convicted = null;
  private String exonerated = null;
  private String sentence = null;
  private String race = null;
  private String sex = null;
  private String age = null;
  private String contributingFactors = null;
  private String DNA = null;
  private String postingDate = null;
  private String lastUpdateDate = null;
  private String featureDescription = null;
  private String narrative = null;

  
  /**
   * Case ID.
   **/
  public ExonerationCaseDetail caseID(BigDecimal caseID) {
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
  public ExonerationCaseDetail firstName(String firstName) {
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
  public ExonerationCaseDetail lastName(String lastName) {
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
   * Link To Image.
   **/
  public ExonerationCaseDetail linkToImage(String linkToImage) {
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
  public ExonerationCaseDetail linkToThumbnail(String linkToThumbnail) {
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

  
  /**
   * Photo Byline.
   **/
  public ExonerationCaseDetail photoByline(String photoByline) {
    this.photoByline = photoByline;
    return this;
  }

  
  @ApiModelProperty(value = "Photo Byline.")
  @JsonProperty("PhotoByline")
  public String getPhotoByline() {
    return photoByline;
  }
  public void setPhotoByline(String photoByline) {
    this.photoByline = photoByline;
  }

  
  /**
   * State.
   **/
  public ExonerationCaseDetail state(String state) {
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
   * County.
   **/
  public ExonerationCaseDetail county(String county) {
    this.county = county;
    return this;
  }

  
  @ApiModelProperty(value = "County.")
  @JsonProperty("County")
  public String getCounty() {
    return county;
  }
  public void setCounty(String county) {
    this.county = county;
  }

  
  /**
   * Most Serious Crime.
   **/
  public ExonerationCaseDetail mostSeriousCrime(String mostSeriousCrime) {
    this.mostSeriousCrime = mostSeriousCrime;
    return this;
  }

  
  @ApiModelProperty(value = "Most Serious Crime.")
  @JsonProperty("MostSeriousCrime")
  public String getMostSeriousCrime() {
    return mostSeriousCrime;
  }
  public void setMostSeriousCrime(String mostSeriousCrime) {
    this.mostSeriousCrime = mostSeriousCrime;
  }

  
  /**
   * Additional Convictions.
   **/
  public ExonerationCaseDetail additionalConvictions(String additionalConvictions) {
    this.additionalConvictions = additionalConvictions;
    return this;
  }

  
  @ApiModelProperty(value = "Additional Convictions.")
  @JsonProperty("AdditionalConvictions")
  public String getAdditionalConvictions() {
    return additionalConvictions;
  }
  public void setAdditionalConvictions(String additionalConvictions) {
    this.additionalConvictions = additionalConvictions;
  }

  
  /**
   * Reported Crime Date.
   **/
  public ExonerationCaseDetail reportedCrimeDate(String reportedCrimeDate) {
    this.reportedCrimeDate = reportedCrimeDate;
    return this;
  }

  
  @ApiModelProperty(value = "Reported Crime Date.")
  @JsonProperty("ReportedCrimeDate")
  public String getReportedCrimeDate() {
    return reportedCrimeDate;
  }
  public void setReportedCrimeDate(String reportedCrimeDate) {
    this.reportedCrimeDate = reportedCrimeDate;
  }

  
  /**
   * Convicted.
   **/
  public ExonerationCaseDetail convicted(String convicted) {
    this.convicted = convicted;
    return this;
  }

  
  @ApiModelProperty(value = "Convicted.")
  @JsonProperty("Convicted")
  public String getConvicted() {
    return convicted;
  }
  public void setConvicted(String convicted) {
    this.convicted = convicted;
  }

  
  /**
   * Exonerated.
   **/
  public ExonerationCaseDetail exonerated(String exonerated) {
    this.exonerated = exonerated;
    return this;
  }

  
  @ApiModelProperty(value = "Exonerated.")
  @JsonProperty("Exonerated")
  public String getExonerated() {
    return exonerated;
  }
  public void setExonerated(String exonerated) {
    this.exonerated = exonerated;
  }

  
  /**
   * Sentence.
   **/
  public ExonerationCaseDetail sentence(String sentence) {
    this.sentence = sentence;
    return this;
  }

  
  @ApiModelProperty(value = "Sentence.")
  @JsonProperty("Sentence")
  public String getSentence() {
    return sentence;
  }
  public void setSentence(String sentence) {
    this.sentence = sentence;
  }

  
  /**
   * Race.
   **/
  public ExonerationCaseDetail race(String race) {
    this.race = race;
    return this;
  }

  
  @ApiModelProperty(value = "Race.")
  @JsonProperty("Race")
  public String getRace() {
    return race;
  }
  public void setRace(String race) {
    this.race = race;
  }

  
  /**
   * Sex.
   **/
  public ExonerationCaseDetail sex(String sex) {
    this.sex = sex;
    return this;
  }

  
  @ApiModelProperty(value = "Sex.")
  @JsonProperty("Sex")
  public String getSex() {
    return sex;
  }
  public void setSex(String sex) {
    this.sex = sex;
  }

  
  /**
   * Age.
   **/
  public ExonerationCaseDetail age(String age) {
    this.age = age;
    return this;
  }

  
  @ApiModelProperty(value = "Age.")
  @JsonProperty("Age")
  public String getAge() {
    return age;
  }
  public void setAge(String age) {
    this.age = age;
  }

  
  /**
   * Contributing Factors.
   **/
  public ExonerationCaseDetail contributingFactors(String contributingFactors) {
    this.contributingFactors = contributingFactors;
    return this;
  }

  
  @ApiModelProperty(value = "Contributing Factors.")
  @JsonProperty("ContributingFactors")
  public String getContributingFactors() {
    return contributingFactors;
  }
  public void setContributingFactors(String contributingFactors) {
    this.contributingFactors = contributingFactors;
  }

  
  /**
   * DNA.
   **/
  public ExonerationCaseDetail DNA(String DNA) {
    this.DNA = DNA;
    return this;
  }

  
  @ApiModelProperty(value = "DNA.")
  @JsonProperty("DNA")
  public String getDNA() {
    return DNA;
  }
  public void setDNA(String DNA) {
    this.DNA = DNA;
  }

  
  /**
   * Posting Date.
   **/
  public ExonerationCaseDetail postingDate(String postingDate) {
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
   * Last Update Date.
   **/
  public ExonerationCaseDetail lastUpdateDate(String lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
    return this;
  }

  
  @ApiModelProperty(value = "Last Update Date.")
  @JsonProperty("LastUpdateDate")
  public String getLastUpdateDate() {
    return lastUpdateDate;
  }
  public void setLastUpdateDate(String lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }

  
  /**
   * Feature Description.
   **/
  public ExonerationCaseDetail featureDescription(String featureDescription) {
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
   * Narrative.
   **/
  public ExonerationCaseDetail narrative(String narrative) {
    this.narrative = narrative;
    return this;
  }

  
  @ApiModelProperty(value = "Narrative.")
  @JsonProperty("Narrative")
  public String getNarrative() {
    return narrative;
  }
  public void setNarrative(String narrative) {
    this.narrative = narrative;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExonerationCaseDetail exonerationCaseDetail = (ExonerationCaseDetail) o;
    return Objects.equals(caseID, exonerationCaseDetail.caseID) &&
        Objects.equals(firstName, exonerationCaseDetail.firstName) &&
        Objects.equals(lastName, exonerationCaseDetail.lastName) &&
        Objects.equals(linkToImage, exonerationCaseDetail.linkToImage) &&
        Objects.equals(linkToThumbnail, exonerationCaseDetail.linkToThumbnail) &&
        Objects.equals(photoByline, exonerationCaseDetail.photoByline) &&
        Objects.equals(state, exonerationCaseDetail.state) &&
        Objects.equals(county, exonerationCaseDetail.county) &&
        Objects.equals(mostSeriousCrime, exonerationCaseDetail.mostSeriousCrime) &&
        Objects.equals(additionalConvictions, exonerationCaseDetail.additionalConvictions) &&
        Objects.equals(reportedCrimeDate, exonerationCaseDetail.reportedCrimeDate) &&
        Objects.equals(convicted, exonerationCaseDetail.convicted) &&
        Objects.equals(exonerated, exonerationCaseDetail.exonerated) &&
        Objects.equals(sentence, exonerationCaseDetail.sentence) &&
        Objects.equals(race, exonerationCaseDetail.race) &&
        Objects.equals(sex, exonerationCaseDetail.sex) &&
        Objects.equals(age, exonerationCaseDetail.age) &&
        Objects.equals(contributingFactors, exonerationCaseDetail.contributingFactors) &&
        Objects.equals(DNA, exonerationCaseDetail.DNA) &&
        Objects.equals(postingDate, exonerationCaseDetail.postingDate) &&
        Objects.equals(lastUpdateDate, exonerationCaseDetail.lastUpdateDate) &&
        Objects.equals(featureDescription, exonerationCaseDetail.featureDescription) &&
        Objects.equals(narrative, exonerationCaseDetail.narrative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseID, firstName, lastName, linkToImage, linkToThumbnail, photoByline, state, county, mostSeriousCrime, additionalConvictions, reportedCrimeDate, convicted, exonerated, sentence, race, sex, age, contributingFactors, DNA, postingDate, lastUpdateDate, featureDescription, narrative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExonerationCaseDetail {\n");
    
    sb.append("    caseID: ").append(toIndentedString(caseID)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    linkToImage: ").append(toIndentedString(linkToImage)).append("\n");
    sb.append("    linkToThumbnail: ").append(toIndentedString(linkToThumbnail)).append("\n");
    sb.append("    photoByline: ").append(toIndentedString(photoByline)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    mostSeriousCrime: ").append(toIndentedString(mostSeriousCrime)).append("\n");
    sb.append("    additionalConvictions: ").append(toIndentedString(additionalConvictions)).append("\n");
    sb.append("    reportedCrimeDate: ").append(toIndentedString(reportedCrimeDate)).append("\n");
    sb.append("    convicted: ").append(toIndentedString(convicted)).append("\n");
    sb.append("    exonerated: ").append(toIndentedString(exonerated)).append("\n");
    sb.append("    sentence: ").append(toIndentedString(sentence)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    contributingFactors: ").append(toIndentedString(contributingFactors)).append("\n");
    sb.append("    DNA: ").append(toIndentedString(DNA)).append("\n");
    sb.append("    postingDate: ").append(toIndentedString(postingDate)).append("\n");
    sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
    sb.append("    featureDescription: ").append(toIndentedString(featureDescription)).append("\n");
    sb.append("    narrative: ").append(toIndentedString(narrative)).append("\n");
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

