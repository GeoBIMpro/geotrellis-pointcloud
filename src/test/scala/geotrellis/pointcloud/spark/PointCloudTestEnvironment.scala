/*
 * Copyright 2017 Azavea
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

package geotrellis.pointcloud.spark

import geotrellis.spark._
import geotrellis.spark.testkit._
import org.apache.hadoop.fs.Path
import org.scalatest.Suite

import java.io.File

trait PointCloudTestEnvironment extends TestEnvironment { self: Suite =>
  val testResources = new File("src/test/resources")
  val lasPath = new Path(s"file://${testResources.getAbsolutePath}/las")
}
