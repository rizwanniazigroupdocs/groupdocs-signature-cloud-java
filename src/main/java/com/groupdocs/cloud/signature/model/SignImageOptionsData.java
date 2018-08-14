/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SignImageOptionsData.java">
 *   Copyright (c) 2003-2018 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.signature.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.signature.model.PaddingData;
import com.groupdocs.cloud.signature.model.PagesSetupData;
import com.groupdocs.cloud.signature.model.SignOptionsData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents the Image Sign Options.
 */
@ApiModel(description = "Represents the Image Sign Options.")
public class SignImageOptionsData extends SignOptionsData {
  @SerializedName("imageGuid")
  private String imageGuid = null;

  @SerializedName("left")
  private Integer left = null;

  @SerializedName("top")
  private Integer top = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  /**
   * Measure type (pixels or percent) for Left and Top properties.
   */
  @JsonAdapter(LocationMeasureTypeEnum.Adapter.class)
  public enum LocationMeasureTypeEnum {
    PIXELS("Pixels"),
    
    PERCENTS("Percents"),
    
    MILLIMETERS("Millimeters");

    private String value;

    LocationMeasureTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LocationMeasureTypeEnum fromValue(String text) {
      for (LocationMeasureTypeEnum b : LocationMeasureTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LocationMeasureTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LocationMeasureTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LocationMeasureTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LocationMeasureTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("locationMeasureType")
  private LocationMeasureTypeEnum locationMeasureType = null;

  /**
   * Measure type (pixels or percent) for Width and Height properties.
   */
  @JsonAdapter(SizeMeasureTypeEnum.Adapter.class)
  public enum SizeMeasureTypeEnum {
    PIXELS("Pixels"),
    
    PERCENTS("Percents"),
    
    MILLIMETERS("Millimeters");

    private String value;

    SizeMeasureTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SizeMeasureTypeEnum fromValue(String text) {
      for (SizeMeasureTypeEnum b : SizeMeasureTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SizeMeasureTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SizeMeasureTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SizeMeasureTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SizeMeasureTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sizeMeasureType")
  private SizeMeasureTypeEnum sizeMeasureType = null;

  @SerializedName("rotationAngle")
  private Integer rotationAngle = null;

  /**
   * Horizontal alignment of signature on document page.
   */
  @JsonAdapter(HorizontalAlignmentEnum.Adapter.class)
  public enum HorizontalAlignmentEnum {
    DEFAULT("Default"),
    
    NONE("None"),
    
    LEFT("Left"),
    
    CENTER("Center"),
    
    RIGHT("Right");

    private String value;

    HorizontalAlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HorizontalAlignmentEnum fromValue(String text) {
      for (HorizontalAlignmentEnum b : HorizontalAlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HorizontalAlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HorizontalAlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HorizontalAlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HorizontalAlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("horizontalAlignment")
  private HorizontalAlignmentEnum horizontalAlignment = null;

  /**
   * Vertical alignment of signature on document page.
   */
  @JsonAdapter(VerticalAlignmentEnum.Adapter.class)
  public enum VerticalAlignmentEnum {
    DEFAULT("Default"),
    
    NONE("None"),
    
    TOP("Top"),
    
    CENTER("Center"),
    
    BOTTOM("Bottom");

    private String value;

    VerticalAlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerticalAlignmentEnum fromValue(String text) {
      for (VerticalAlignmentEnum b : VerticalAlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VerticalAlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerticalAlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerticalAlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VerticalAlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("verticalAlignment")
  private VerticalAlignmentEnum verticalAlignment = null;

  @SerializedName("margin")
  private PaddingData margin = null;

  /**
   * Gets or sets the measure type (pixels or percent) for Margin.
   */
  @JsonAdapter(MarginMeasureTypeEnum.Adapter.class)
  public enum MarginMeasureTypeEnum {
    PIXELS("Pixels"),
    
    PERCENTS("Percents"),
    
    MILLIMETERS("Millimeters");

    private String value;

    MarginMeasureTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MarginMeasureTypeEnum fromValue(String text) {
      for (MarginMeasureTypeEnum b : MarginMeasureTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MarginMeasureTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MarginMeasureTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MarginMeasureTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MarginMeasureTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("marginMeasureType")
  private MarginMeasureTypeEnum marginMeasureType = null;

  @SerializedName("opacity")
  private Double opacity = null;

  @SerializedName("signAllPages")
  private Boolean signAllPages = null;

  public SignImageOptionsData imageGuid(String imageGuid) {
    this.imageGuid = imageGuid;
    return this;
  }

   /**
   * Gets or sets the signature image file name. This property is used only if ImageStream is not specified.
   * @return imageGuid
  **/
  @ApiModelProperty(value = "Gets or sets the signature image file name. This property is used only if ImageStream is not specified.")
  public String getImageGuid() {
    return imageGuid;
  }

  public void setImageGuid(String imageGuid) {
    this.imageGuid = imageGuid;
  }

  public SignImageOptionsData left(Integer left) {
    this.left = left;
    return this;
  }

   /**
   * Left X position of Signature on Document Page in Measure values (pixels or percent see  LocationMeasureType). (works if horizontal alignment is not specified).
   * @return left
  **/
  @ApiModelProperty(value = "Left X position of Signature on Document Page in Measure values (pixels or percent see  LocationMeasureType). (works if horizontal alignment is not specified).")
  public Integer getLeft() {
    return left;
  }

  public void setLeft(Integer left) {
    this.left = left;
  }

  public SignImageOptionsData top(Integer top) {
    this.top = top;
    return this;
  }

   /**
   * Top Y Position of Signature on Document Page in Measure values (pixels or percent see  LocationMeasureType). (works if vertical alignment is not specified).
   * @return top
  **/
  @ApiModelProperty(value = "Top Y Position of Signature on Document Page in Measure values (pixels or percent see  LocationMeasureType). (works if vertical alignment is not specified).")
  public Integer getTop() {
    return top;
  }

  public void setTop(Integer top) {
    this.top = top;
  }

  public SignImageOptionsData width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width of Signature on Document Page in Measure values (pixels or percent see  SizeMeasureType).
   * @return width
  **/
  @ApiModelProperty(value = "Width of Signature on Document Page in Measure values (pixels or percent see  SizeMeasureType).")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public SignImageOptionsData height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height of Signature on Document Page in Measure values (pixels or percent see  SizeMeasureType).
   * @return height
  **/
  @ApiModelProperty(value = "Height of Signature on Document Page in Measure values (pixels or percent see  SizeMeasureType).")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public SignImageOptionsData locationMeasureType(LocationMeasureTypeEnum locationMeasureType) {
    this.locationMeasureType = locationMeasureType;
    return this;
  }

   /**
   * Measure type (pixels or percent) for Left and Top properties.
   * @return locationMeasureType
  **/
  @ApiModelProperty(value = "Measure type (pixels or percent) for Left and Top properties.")
  public LocationMeasureTypeEnum getLocationMeasureType() {
    return locationMeasureType;
  }

  public void setLocationMeasureType(LocationMeasureTypeEnum locationMeasureType) {
    this.locationMeasureType = locationMeasureType;
  }

  public SignImageOptionsData sizeMeasureType(SizeMeasureTypeEnum sizeMeasureType) {
    this.sizeMeasureType = sizeMeasureType;
    return this;
  }

   /**
   * Measure type (pixels or percent) for Width and Height properties.
   * @return sizeMeasureType
  **/
  @ApiModelProperty(value = "Measure type (pixels or percent) for Width and Height properties.")
  public SizeMeasureTypeEnum getSizeMeasureType() {
    return sizeMeasureType;
  }

  public void setSizeMeasureType(SizeMeasureTypeEnum sizeMeasureType) {
    this.sizeMeasureType = sizeMeasureType;
  }

  public SignImageOptionsData rotationAngle(Integer rotationAngle) {
    this.rotationAngle = rotationAngle;
    return this;
  }

   /**
   * Rotation angle of signature on document page (clockwise).
   * @return rotationAngle
  **/
  @ApiModelProperty(value = "Rotation angle of signature on document page (clockwise).")
  public Integer getRotationAngle() {
    return rotationAngle;
  }

  public void setRotationAngle(Integer rotationAngle) {
    this.rotationAngle = rotationAngle;
  }

  public SignImageOptionsData horizontalAlignment(HorizontalAlignmentEnum horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
    return this;
  }

   /**
   * Horizontal alignment of signature on document page.
   * @return horizontalAlignment
  **/
  @ApiModelProperty(value = "Horizontal alignment of signature on document page.")
  public HorizontalAlignmentEnum getHorizontalAlignment() {
    return horizontalAlignment;
  }

  public void setHorizontalAlignment(HorizontalAlignmentEnum horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
  }

  public SignImageOptionsData verticalAlignment(VerticalAlignmentEnum verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
    return this;
  }

   /**
   * Vertical alignment of signature on document page.
   * @return verticalAlignment
  **/
  @ApiModelProperty(value = "Vertical alignment of signature on document page.")
  public VerticalAlignmentEnum getVerticalAlignment() {
    return verticalAlignment;
  }

  public void setVerticalAlignment(VerticalAlignmentEnum verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
  }

  public SignImageOptionsData margin(PaddingData margin) {
    this.margin = margin;
    return this;
  }

   /**
   * Gets or sets the space between Sign and Document edges. (works ONLY if horizontal or vertical alignment are specified).
   * @return margin
  **/
  @ApiModelProperty(value = "Gets or sets the space between Sign and Document edges. (works ONLY if horizontal or vertical alignment are specified).")
  public PaddingData getMargin() {
    return margin;
  }

  public void setMargin(PaddingData margin) {
    this.margin = margin;
  }

  public SignImageOptionsData marginMeasureType(MarginMeasureTypeEnum marginMeasureType) {
    this.marginMeasureType = marginMeasureType;
    return this;
  }

   /**
   * Gets or sets the measure type (pixels or percent) for Margin.
   * @return marginMeasureType
  **/
  @ApiModelProperty(value = "Gets or sets the measure type (pixels or percent) for Margin.")
  public MarginMeasureTypeEnum getMarginMeasureType() {
    return marginMeasureType;
  }

  public void setMarginMeasureType(MarginMeasureTypeEnum marginMeasureType) {
    this.marginMeasureType = marginMeasureType;
  }

  public SignImageOptionsData opacity(Double opacity) {
    this.opacity = opacity;
    return this;
  }

   /**
   * Gets or sets the additional opacity for sign image (value from 0.0 (clear) through 1.0 (opaque)). By default the value is 1.0.
   * @return opacity
  **/
  @ApiModelProperty(value = "Gets or sets the additional opacity for sign image (value from 0.0 (clear) through 1.0 (opaque)). By default the value is 1.0.")
  public Double getOpacity() {
    return opacity;
  }

  public void setOpacity(Double opacity) {
    this.opacity = opacity;
  }

  public SignImageOptionsData signAllPages(Boolean signAllPages) {
    this.signAllPages = signAllPages;
    return this;
  }

   /**
   * Put signature on all document pages.
   * @return signAllPages
  **/
  @ApiModelProperty(value = "Put signature on all document pages.")
  public Boolean isSignAllPages() {
    return signAllPages;
  }

  public void setSignAllPages(Boolean signAllPages) {
    this.signAllPages = signAllPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignImageOptionsData signImageOptionsData = (SignImageOptionsData) o;
    return Objects.equals(this.imageGuid, signImageOptionsData.imageGuid) &&
        Objects.equals(this.left, signImageOptionsData.left) &&
        Objects.equals(this.top, signImageOptionsData.top) &&
        Objects.equals(this.width, signImageOptionsData.width) &&
        Objects.equals(this.height, signImageOptionsData.height) &&
        Objects.equals(this.locationMeasureType, signImageOptionsData.locationMeasureType) &&
        Objects.equals(this.sizeMeasureType, signImageOptionsData.sizeMeasureType) &&
        Objects.equals(this.rotationAngle, signImageOptionsData.rotationAngle) &&
        Objects.equals(this.horizontalAlignment, signImageOptionsData.horizontalAlignment) &&
        Objects.equals(this.verticalAlignment, signImageOptionsData.verticalAlignment) &&
        Objects.equals(this.margin, signImageOptionsData.margin) &&
        Objects.equals(this.marginMeasureType, signImageOptionsData.marginMeasureType) &&
        Objects.equals(this.opacity, signImageOptionsData.opacity) &&
        Objects.equals(this.signAllPages, signImageOptionsData.signAllPages) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageGuid, left, top, width, height, locationMeasureType, sizeMeasureType, rotationAngle, horizontalAlignment, verticalAlignment, margin, marginMeasureType, opacity, signAllPages, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignImageOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    imageGuid: ").append(toIndentedString(imageGuid)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    locationMeasureType: ").append(toIndentedString(locationMeasureType)).append("\n");
    sb.append("    sizeMeasureType: ").append(toIndentedString(sizeMeasureType)).append("\n");
    sb.append("    rotationAngle: ").append(toIndentedString(rotationAngle)).append("\n");
    sb.append("    horizontalAlignment: ").append(toIndentedString(horizontalAlignment)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    marginMeasureType: ").append(toIndentedString(marginMeasureType)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
    sb.append("    signAllPages: ").append(toIndentedString(signAllPages)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

