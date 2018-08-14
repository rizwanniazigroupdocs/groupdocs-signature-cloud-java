/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="BorderLineData.java">
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
import com.groupdocs.cloud.signature.model.Color;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Instance to keep Border line properties.
 */
@ApiModel(description = "Instance to keep Border line properties.")
public class BorderLineData {
  /**
   * Gets or sets the signature border style.
   */
  @JsonAdapter(StyleEnum.Adapter.class)
  public enum StyleEnum {
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

    StyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StyleEnum fromValue(String text) {
      for (StyleEnum b : StyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StyleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StyleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("style")
  private StyleEnum style = null;

  @SerializedName("transparency")
  private Double transparency = null;

  @SerializedName("weight")
  private Double weight = null;

  @SerializedName("color")
  private Color color = null;

  public BorderLineData style(StyleEnum style) {
    this.style = style;
    return this;
  }

   /**
   * Gets or sets the signature border style.
   * @return style
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the signature border style.")
  public StyleEnum getStyle() {
    return style;
  }

  public void setStyle(StyleEnum style) {
    this.style = style;
  }

  public BorderLineData transparency(Double transparency) {
    this.transparency = transparency;
    return this;
  }

   /**
   * Gets or sets the signature border transparency (value from 0.0 (opaque) through 1.0 (clear)).
   * @return transparency
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the signature border transparency (value from 0.0 (opaque) through 1.0 (clear)).")
  public Double getTransparency() {
    return transparency;
  }

  public void setTransparency(Double transparency) {
    this.transparency = transparency;
  }

  public BorderLineData weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Gets or sets the weight of the signature border. 
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the weight of the signature border. ")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public BorderLineData color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * Gets or sets the border color of signature.
   * @return color
  **/
  @ApiModelProperty(value = "Gets or sets the border color of signature.")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BorderLineData borderLineData = (BorderLineData) o;
    return Objects.equals(this.style, borderLineData.style) &&
        Objects.equals(this.transparency, borderLineData.transparency) &&
        Objects.equals(this.weight, borderLineData.weight) &&
        Objects.equals(this.color, borderLineData.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(style, transparency, weight, color);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BorderLineData {\n");
    
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    transparency: ").append(toIndentedString(transparency)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

