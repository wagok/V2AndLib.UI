/*
 * Copyright (C) 2012 V.Shcryabets (vshcryabets@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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
package com.v2soft.AndLib.dataproviders;

/**
 * Task interface.
 * @author V.Shcriyabets (vshcryabets@gmail.com)
 * Please don't use task messages with "what" over 0x80000000
 */
public interface ITask {
    public int MESSAGE_TASK_FINISHED_SUCCESS = 0x80000000;
    public int MESSAGE_TASK_EXCEPTION = 0x80000001;
    public void execute(ITaskSimpleListener handler) throws Exception;
    public void setTaskId(int id);
    public int getTaskId();
    // Task tags - extra piece of information
    public ITask setTaskTag(int id);
    public int getTaskTag();
    public ITask setTaskTagObject(Object tag);
    public Object getTaskTagObject();
    public void cancelTask();
}
