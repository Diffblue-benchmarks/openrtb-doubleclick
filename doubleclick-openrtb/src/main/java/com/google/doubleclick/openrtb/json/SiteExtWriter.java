/*
 * Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.doubleclick.openrtb.json;

import static com.google.openrtb.json.OpenRtbJsonUtils.writeEnumField;

import com.fasterxml.jackson.core.JsonGenerator;
import com.google.doubleclick.AdxExt.SiteExt;
import com.google.openrtb.json.OpenRtbJsonExtWriter;
import java.io.IOException;

/**
 * Writer for {@link SiteExt}.
 */
class SiteExtWriter extends OpenRtbJsonExtWriter<SiteExt> {

  @Override protected void write(SiteExt ext, JsonGenerator gen) throws IOException {
    if (ext.hasAmp()) {
      writeEnumField("amp", ext.getAmp(), gen);
    }
  }
}
