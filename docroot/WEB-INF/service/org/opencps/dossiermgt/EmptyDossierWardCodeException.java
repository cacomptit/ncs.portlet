/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.opencps.dossiermgt;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author trungnt
 */
public class EmptyDossierWardCodeException extends PortalException {

	public EmptyDossierWardCodeException() {
		super();
	}

	public EmptyDossierWardCodeException(String msg) {
		super(msg);
	}

	public EmptyDossierWardCodeException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public EmptyDossierWardCodeException(Throwable cause) {
		super(cause);
	}

}