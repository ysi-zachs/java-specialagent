/* Copyright 2019 The OpenTracing Authors
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

package io.opentracing.contrib.specialagent;

public final class UtilConstants {
  public static final String FINGERPRINT_FILE = "fingerprint.bin";
  public static final String META_INF_PLUGIN_PATH = "META-INF/plugins/";
  public static final String META_INF_ISO_PATH = "META-INF/iso/";
  public static final String META_INF_TEST_MANIFEST = META_INF_PLUGIN_PATH + "TEST-MANIFEST.MF";

  private UtilConstants() {
  }
}