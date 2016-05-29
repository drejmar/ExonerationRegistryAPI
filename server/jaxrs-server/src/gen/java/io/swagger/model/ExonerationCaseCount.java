package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-29T20:39:44.895Z")
public class ExonerationCaseCount   {
  
  private BigDecimal numberOfExonerations = null;
  private BigDecimal latestExonerationID = null;

  
  /**
   * Number Of Exonerations.
   **/
  public ExonerationCaseCount numberOfExonerations(BigDecimal numberOfExonerations) {
    this.numberOfExonerations = numberOfExonerations;
    return this;
  }

  
  @ApiModelProperty(value = "Number Of Exonerations.")
  @JsonProperty("NumberOfExonerations")
  public BigDecimal getNumberOfExonerations() {
    return numberOfExonerations;
  }
  public void setNumberOfExonerations(BigDecimal numberOfExonerations) {
    this.numberOfExonerations = numberOfExonerations;
  }

  
  /**
   * Latest Exoneration Case ID.
   **/
  public ExonerationCaseCount latestExonerationID(BigDecimal latestExonerationID) {
    this.latestExonerationID = latestExonerationID;
    return this;
  }

  
  @ApiModelProperty(value = "Latest Exoneration Case ID.")
  @JsonProperty("LatestExonerationID")
  public BigDecimal getLatestExonerationID() {
    return latestExonerationID;
  }
  public void setLatestExonerationID(BigDecimal latestExonerationID) {
    this.latestExonerationID = latestExonerationID;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExonerationCaseCount exonerationCaseCount = (ExonerationCaseCount) o;
    return Objects.equals(numberOfExonerations, exonerationCaseCount.numberOfExonerations) &&
        Objects.equals(latestExonerationID, exonerationCaseCount.latestExonerationID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfExonerations, latestExonerationID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExonerationCaseCount {\n");
    
    sb.append("    numberOfExonerations: ").append(toIndentedString(numberOfExonerations)).append("\n");
    sb.append("    latestExonerationID: ").append(toIndentedString(latestExonerationID)).append("\n");
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

