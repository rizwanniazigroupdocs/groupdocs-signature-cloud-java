/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ImagesSignTextOptionsData.java">
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
import com.groupdocs.cloud.signature.model.BrushData;
import com.groupdocs.cloud.signature.model.Color;
import com.groupdocs.cloud.signature.model.PaddingData;
import com.groupdocs.cloud.signature.model.PagesSetupData;
import com.groupdocs.cloud.signature.model.SignTextOptionsData;
import com.groupdocs.cloud.signature.model.SignatureFontData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents the Text Sign Options for Images Documents.
 */
@ApiModel(description = "Represents the Text Sign Options for Images Documents.")
public class ImagesSignTextOptionsData extends SignTextOptionsData {
  /**
   * Gets or sets the signature border style.
   */
  @JsonAdapter(BorderDashStyleEnum.Adapter.class)
  public enum BorderDashStyleEnum {
    DEFAULT("Default"),
    
    SOLID("Solid"),
    
    SHORTDASH("ShortDash"),
    
    SHORTDOT("ShortDot"),
    
    SHORTDASHDOT("ShortDashDot"),
    
    SHORTDASHDOTDOT("ShortDashDotDot"),
    
    DOT("Dot"),
    
    DASH("Dash"),
    
    LONGDASH("LongDash"),
    
    DASHDOT("DashDot"),
    
    LONGDASHDOT("LongDashDot"),
    
    LONGDASHDOTDOT("LongDashDotDot");

    private String value;

    BorderDashStyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BorderDashStyleEnum fromValue(String text) {
      for (BorderDashStyleEnum b : BorderDashStyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BorderDashStyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BorderDashStyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BorderDashStyleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BorderDashStyleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("borderDashStyle")
  private BorderDashStyleEnum borderDashStyle = null;

  @SerializedName("borderTransparency")
  private Double borderTransparency = null;

  @SerializedName("borderWeight")
  private Double borderWeight = null;

  @SerializedName("backgroundTransparency")
  private Double backgroundTransparency = null;

  /**
   * Gets or sets the type of text signature implementation.
   */
  @JsonAdapter(SignatureImplementationEnum.Adapter.class)
  public enum SignatureImplementationEnum {
    TEXTASIMAGE("TextAsImage"),
    
    WATERMARK("Watermark");

    private String value;

    SignatureImplementationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SignatureImplementationEnum fromValue(String text) {
      for (SignatureImplementationEnum b : SignatureImplementationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SignatureImplementationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SignatureImplementationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SignatureImplementationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SignatureImplementationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("signatureImplementation")
  private SignatureImplementationEnum signatureImplementation = null;

  @SerializedName("opacity")
  private Double opacity = null;

  /**
   * Horizontal alignment of text inside a signature.
   */
  @JsonAdapter(TextHorizontalAlignmentEnum.Adapter.class)
  public enum TextHorizontalAlignmentEnum {
    LEFT("Left"),
    
    CENTER("Center"),
    
    RIGHT("Right");

    private String value;

    TextHorizontalAlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextHorizontalAlignmentEnum fromValue(String text) {
      for (TextHorizontalAlignmentEnum b : TextHorizontalAlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextHorizontalAlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextHorizontalAlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextHorizontalAlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextHorizontalAlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("textHorizontalAlignment")
  private TextHorizontalAlignmentEnum textHorizontalAlignment = null;

  /**
   * Vertical alignment of text inside a signature.
   */
  @JsonAdapter(TextVerticalAlignmentEnum.Adapter.class)
  public enum TextVerticalAlignmentEnum {
    TOP("Top"),
    
    CENTER("Center"),
    
    BOTTOM("Bottom");

    private String value;

    TextVerticalAlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextVerticalAlignmentEnum fromValue(String text) {
      for (TextVerticalAlignmentEnum b : TextVerticalAlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextVerticalAlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextVerticalAlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextVerticalAlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextVerticalAlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("textVerticalAlignment")
  private TextVerticalAlignmentEnum textVerticalAlignment = null;

  public ImagesSignTextOptionsData borderDashStyle(BorderDashStyleEnum borderDashStyle) {
    this.borderDashStyle = borderDashStyle;
    return this;
  }

   /**
   * Gets or sets the signature border style.
   * @return borderDashStyle
  **/
  @ApiModelProperty(value = "Gets or sets the signature border style.")
  public BorderDashStyleEnum getBorderDashStyle() {
    return borderDashStyle;
  }

  public void setBorderDashStyle(BorderDashStyleEnum borderDashStyle) {
    this.borderDashStyle = borderDashStyle;
  }

  public ImagesSignTextOptionsData borderTransparency(Double borderTransparency) {
    this.borderTransparency = borderTransparency;
    return this;
  }

   /**
   * Gets or sets the signature border transparency (value from 0.0 (opaque) through 1.0 (clear)).
   * @return borderTransparency
  **/
  @ApiModelProperty(value = "Gets or sets the signature border transparency (value from 0.0 (opaque) through 1.0 (clear)).")
  public Double getBorderTransparency() {
    return borderTransparency;
  }

  public void setBorderTransparency(Double borderTransparency) {
    this.borderTransparency = borderTransparency;
  }

  public ImagesSignTextOptionsData borderWeight(Double borderWeight) {
    this.borderWeight = borderWeight;
    return this;
  }

   /**
   * Gets or sets the weight of the signature border. 
   * @return borderWeight
  **/
  @ApiModelProperty(value = "Gets or sets the weight of the signature border. ")
  public Double getBorderWeight() {
    return borderWeight;
  }

  public void setBorderWeight(Double borderWeight) {
    this.borderWeight = borderWeight;
  }

  public ImagesSignTextOptionsData backgroundTransparency(Double backgroundTransparency) {
    this.backgroundTransparency = backgroundTransparency;
    return this;
  }

   /**
   * Gets or sets the signature background transparency (value from 0.0 (opaque) through 1.0 (clear)).
   * @return backgroundTransparency
  **/
  @ApiModelProperty(value = "Gets or sets the signature background transparency (value from 0.0 (opaque) through 1.0 (clear)).")
  public Double getBackgroundTransparency() {
    return backgroundTransparency;
  }

  public void setBackgroundTransparency(Double backgroundTransparency) {
    this.backgroundTransparency = backgroundTransparency;
  }

  public ImagesSignTextOptionsData signatureImplementation(SignatureImplementationEnum signatureImplementation) {
    this.signatureImplementation = signatureImplementation;
    return this;
  }

   /**
   * Gets or sets the type of text signature implementation.
   * @return signatureImplementation
  **/
  @ApiModelProperty(value = "Gets or sets the type of text signature implementation.")
  public SignatureImplementationEnum getSignatureImplementation() {
    return signatureImplementation;
  }

  public void setSignatureImplementation(SignatureImplementationEnum signatureImplementation) {
    this.signatureImplementation = signatureImplementation;
  }

  public ImagesSignTextOptionsData opacity(Double opacity) {
    this.opacity = opacity;
    return this;
  }

   /**
   * Gets or sets the signature opacity (value from 0.0 (clear) through 1.0 (opaque)). By default the value is 1.0.
   * @return opacity
  **/
  @ApiModelProperty(value = "Gets or sets the signature opacity (value from 0.0 (clear) through 1.0 (opaque)). By default the value is 1.0.")
  public Double getOpacity() {
    return opacity;
  }

  public void setOpacity(Double opacity) {
    this.opacity = opacity;
  }

  public ImagesSignTextOptionsData textHorizontalAlignment(TextHorizontalAlignmentEnum textHorizontalAlignment) {
    this.textHorizontalAlignment = textHorizontalAlignment;
    return this;
  }

   /**
   * Horizontal alignment of text inside a signature.
   * @return textHorizontalAlignment
  **/
  @ApiModelProperty(value = "Horizontal alignment of text inside a signature.")
  public TextHorizontalAlignmentEnum getTextHorizontalAlignment() {
    return textHorizontalAlignment;
  }

  public void setTextHorizontalAlignment(TextHorizontalAlignmentEnum textHorizontalAlignment) {
    this.textHorizontalAlignment = textHorizontalAlignment;
  }

  public ImagesSignTextOptionsData textVerticalAlignment(TextVerticalAlignmentEnum textVerticalAlignment) {
    this.textVerticalAlignment = textVerticalAlignment;
    return this;
  }

   /**
   * Vertical alignment of text inside a signature.
   * @return textVerticalAlignment
  **/
  @ApiModelProperty(value = "Vertical alignment of text inside a signature.")
  public TextVerticalAlignmentEnum getTextVerticalAlignment() {
    return textVerticalAlignment;
  }

  public void setTextVerticalAlignment(TextVerticalAlignmentEnum textVerticalAlignment) {
    this.textVerticalAlignment = textVerticalAlignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImagesSignTextOptionsData imagesSignTextOptionsData = (ImagesSignTextOptionsData) o;
    return Objects.equals(this.borderDashStyle, imagesSignTextOptionsData.borderDashStyle) &&
        Objects.equals(this.borderTransparency, imagesSignTextOptionsData.borderTransparency) &&
        Objects.equals(this.borderWeight, imagesSignTextOptionsData.borderWeight) &&
        Objects.equals(this.backgroundTransparency, imagesSignTextOptionsData.backgroundTransparency) &&
        Objects.equals(this.signatureImplementation, imagesSignTextOptionsData.signatureImplementation) &&
        Objects.equals(this.opacity, imagesSignTextOptionsData.opacity) &&
        Objects.equals(this.textHorizontalAlignment, imagesSignTextOptionsData.textHorizontalAlignment) &&
        Objects.equals(this.textVerticalAlignment, imagesSignTextOptionsData.textVerticalAlignment) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borderDashStyle, borderTransparency, borderWeight, backgroundTransparency, signatureImplementation, opacity, textHorizontalAlignment, textVerticalAlignment, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImagesSignTextOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    borderDashStyle: ").append(toIndentedString(borderDashStyle)).append("\n");
    sb.append("    borderTransparency: ").append(toIndentedString(borderTransparency)).append("\n");
    sb.append("    borderWeight: ").append(toIndentedString(borderWeight)).append("\n");
    sb.append("    backgroundTransparency: ").append(toIndentedString(backgroundTransparency)).append("\n");
    sb.append("    signatureImplementation: ").append(toIndentedString(signatureImplementation)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
    sb.append("    textHorizontalAlignment: ").append(toIndentedString(textHorizontalAlignment)).append("\n");
    sb.append("    textVerticalAlignment: ").append(toIndentedString(textVerticalAlignment)).append("\n");
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

