/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PostDigitalRequest.java">
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

package com.groupdocs.cloud.signature.model.requests;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.signature.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.File;

/**
 * Request model for postDigital method.
 */
public class PostDigitalRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("signOptionsData")
  private SignOptionsData signOptionsData = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("folder")
  private String folder = null;

  @SerializedName("certificateFile")
  private String certificateFile = null;

  @SerializedName("imageFile")
  private String imageFile = null;

  @SerializedName("storage")
  private String storage = null;

  /**
   * The document name
   * @return The document name
  **/
  @ApiModelProperty(example = "name_example", required = true, value = "The document name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Digital Signature Options for corresponding Document Type
   * @return Digital Signature Options for corresponding Document Type
  **/
  @ApiModelProperty(example = "new SignOptionsData()", value = "Digital Signature Options for corresponding Document Type")
  public SignOptionsData getSignOptionsData() {
    return signOptionsData;
  }

  public void setSignOptionsData(SignOptionsData signOptionsData) {
    this.signOptionsData = signOptionsData;
  }

  /**
   * Document password if required.
   * @return Document password if required.
  **/
  @ApiModelProperty(example = "password_example", value = "Document password if required.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * The folder name
   * @return The folder name
  **/
  @ApiModelProperty(example = "folder_example", value = "The folder name")
  public String getFolder() {
    return folder;
  }

  public void setFolder(String folder) {
    this.folder = folder;
  }

  /**
   * Digital certificate file name.
   * @return Digital certificate file name.
  **/
  @ApiModelProperty(example = "certificateFile_example", value = "Digital certificate file name.")
  public String getCertificateFile() {
    return certificateFile;
  }

  public void setCertificateFile(String certificateFile) {
    this.certificateFile = certificateFile;
  }

  /**
   * Image file.
   * @return Image file.
  **/
  @ApiModelProperty(example = "imageFile_example", value = "Image file.")
  public String getImageFile() {
    return imageFile;
  }

  public void setImageFile(String imageFile) {
    this.imageFile = imageFile;
  }

  /**
   * The file storage which have to be used.
   * @return The file storage which have to be used.
  **/
  @ApiModelProperty(example = "storage_example", value = "The file storage which have to be used.")
  public String getStorage() {
    return storage;
  }

  public void setStorage(String storage) {
    this.storage = storage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    
    PostDigitalRequest request = (PostDigitalRequest) o;
    return Objects.equals(this.name, request.name) &&
        Objects.equals(this.signOptionsData, request.signOptionsData) &&
        Objects.equals(this.password, request.password) &&
        Objects.equals(this.folder, request.folder) &&
        Objects.equals(this.certificateFile, request.certificateFile) &&
        Objects.equals(this.imageFile, request.imageFile) &&
        Objects.equals(this.storage, request.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, signOptionsData, password, folder, certificateFile, imageFile, storage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostDigital {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    signOptionsData: ").append(toIndentedString(signOptionsData)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    certificateFile: ").append(toIndentedString(certificateFile)).append("\n");
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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

