/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.application.impl.deployment.metadata;

import java.util.List;

import org.camunda.bpm.application.impl.deployment.metadata.spi.ProcessArchiveXml;
import org.camunda.bpm.application.impl.deployment.metadata.spi.ProcessEngineXml;
import org.camunda.bpm.application.impl.deployment.metadata.spi.ProcessesXml;

/**
 * @author Daniel Meyer
 *
 */
public class ProcessesXmlImpl implements ProcessesXml {
  
  private List<ProcessEngineXml> processEngineXmls;
  private List<ProcessArchiveXml> processArchiveXmls;
  
  public ProcessesXmlImpl(List<ProcessEngineXml> processEngineXmls, List<ProcessArchiveXml> processArchiveXmls) {
    this.processEngineXmls = processEngineXmls;
    this.processArchiveXmls = processArchiveXmls;
  }

  public List<ProcessEngineXml> getProcessEngines() {
    return processEngineXmls;
  }

  public List<ProcessArchiveXml> getProcessArchives() {
    return processArchiveXmls;
  }

}
