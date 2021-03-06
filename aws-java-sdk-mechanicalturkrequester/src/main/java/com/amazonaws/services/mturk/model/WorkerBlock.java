/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The WorkerBlock data structure represents a Worker who has been blocked. It has two elements: the WorkerId and the
 * Reason for the block.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/WorkerBlock" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkerBlock implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Worker who accepted the HIT.
     * </p>
     */
    private String workerId;
    /**
     * <p>
     * A message explaining the reason the Worker was blocked.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The ID of the Worker who accepted the HIT.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker who accepted the HIT.
     */

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    /**
     * <p>
     * The ID of the Worker who accepted the HIT.
     * </p>
     * 
     * @return The ID of the Worker who accepted the HIT.
     */

    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * <p>
     * The ID of the Worker who accepted the HIT.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker who accepted the HIT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerBlock withWorkerId(String workerId) {
        setWorkerId(workerId);
        return this;
    }

    /**
     * <p>
     * A message explaining the reason the Worker was blocked.
     * </p>
     * 
     * @param reason
     *        A message explaining the reason the Worker was blocked.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A message explaining the reason the Worker was blocked.
     * </p>
     * 
     * @return A message explaining the reason the Worker was blocked.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A message explaining the reason the Worker was blocked.
     * </p>
     * 
     * @param reason
     *        A message explaining the reason the Worker was blocked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerBlock withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWorkerId() != null)
            sb.append("WorkerId: ").append(getWorkerId()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkerBlock == false)
            return false;
        WorkerBlock other = (WorkerBlock) obj;
        if (other.getWorkerId() == null ^ this.getWorkerId() == null)
            return false;
        if (other.getWorkerId() != null && other.getWorkerId().equals(this.getWorkerId()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkerId() == null) ? 0 : getWorkerId().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public WorkerBlock clone() {
        try {
            return (WorkerBlock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.WorkerBlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
