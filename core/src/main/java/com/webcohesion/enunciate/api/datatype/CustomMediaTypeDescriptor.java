/**
 * Copyright © 2006-2016 Web Cohesion (info@webcohesion.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webcohesion.enunciate.api.datatype;

import java.util.Collections;
import java.util.Map;

import com.webcohesion.enunciate.api.resources.MediaTypeDescriptor;

/**
 * @author Ryan Heaton
 */
public class CustomMediaTypeDescriptor implements MediaTypeDescriptor {

  private final String mediaType;
  private final float qs;
  private final Map<String, String> params;
  private Example example;

  public CustomMediaTypeDescriptor(String mediaType) {
    this(mediaType, 1.0F);
  }

  public CustomMediaTypeDescriptor(String mediaType, float qs) {
    this(mediaType, qs, Collections.<String, String>emptyMap());
  }

  public CustomMediaTypeDescriptor(String mediaType, float qs, Map<String, String> params) {
    this.mediaType = mediaType;
    this.qs = qs;
    this.params = params;
  }

  @Override
  public String getMediaType() {
    return mediaType;
  }

  @Override
  public DataTypeReference getDataType() {
    return null;
  }

  @Override
  public String getSyntax() {
    return null;
  }

  @Override
  public float getQualityOfSourceFactor() {
    return this.qs;
  }

  @Override
  public Map<String, String> getMediaTypeParams() {
    return this.params;
  }

  @Override
  public Example getExample() {
    return this.example;
  }

  public void setExample(Example example) {
    this.example = example;
  }
}