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
package org.camunda.bpm.container.spi;

import org.activiti.engine.ProcessEngine;
import org.camunda.bpm.ProcessEngineService;
import org.camunda.bpm.application.ProcessApplication;

/**
 * <p>The {@link RuntimeContainerDelegate} allows the process engine to integrate with the
 * runtime container in which it is deployed. Examples of "runtime containers" are
 * <ul> 
 *  <li>JBoss AS 7 (Module Service Container),</li>
 *  <li>The JMX Container,</li>
 *  <li>An OSGi Runtime,</li>
 *  <li>...</li>
 * </ul>
 * The {@link RuntimeContainerDelegate} allows the process engine to leverage container-provided infrastructure such as 
 * Thread pools, deployment subsystems, service registries etc.</p>
 * 
 * <p>It is not intended for client applications to use this class directly.</p>
 * 
 * @author Daniel Meyer
 * 
 */
public interface RuntimeContainerDelegate {
  
  /**
   * Register a {@link ProcessEngine} instance with the RuntimeContainer.
   * 
   */
  public void registerProcessEngine(ProcessEngine processEngine);
  
  /**
   * Unregister a {@link ProcessEngine} instance with the RuntimeContainer.
   * 
   */
  public void unregisterProcessEngine(ProcessEngine processEngine);
  
//  public void registerJobAcquisition(JobAcquisition jobAcquisitionConfiguration);

//  public void unregisterJobAcquisition(JobAcquisition jobAcquisitionConfiguration);
  
  /**
   * Deploy a {@link ProcessApplication} into the runtime container.
   * 
   */
  public void deployProcessApplication(ProcessApplication processApplication);
  
  /**
   * Undeploy a {@link ProcessApplication} from the runtime container.
   * 
   */
  public void undeployProcessApplication(ProcessApplication processApplication);

  /**
   * @return the Container {@link ProcessEngineService} implementation. 
   */
  public ProcessEngineService getProcessEngineService();
  
//  public JobExecutorService getJobExecutorService();

//  public ProcessApplicationService getProcessApplicationService();

}
