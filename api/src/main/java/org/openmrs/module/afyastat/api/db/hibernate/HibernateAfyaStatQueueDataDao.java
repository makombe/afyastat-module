/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.afyastat.api.db.hibernate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.afyastat.api.db.AfyaStatQueueDataDao;
import org.openmrs.module.afyastat.model.AfyaStatQueueData;

/**
 */
public class HibernateAfyaStatQueueDataDao extends HibernateAfyaDataDao<AfyaStatQueueData> implements AfyaStatQueueDataDao {
	
	private final Log log = LogFactory.getLog(HibernateAfyaStatQueueDataDao.class);
	
	/**
	 * Default constructor.
	 */
	protected HibernateAfyaStatQueueDataDao() {
		super(AfyaStatQueueData.class);
	}
}
