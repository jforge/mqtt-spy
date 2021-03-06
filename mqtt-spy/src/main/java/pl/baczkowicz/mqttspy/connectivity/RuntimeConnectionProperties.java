/***********************************************************************************
 * 
 * Copyright (c) 2014 Kamil Baczkowicz
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 
 *    Kamil Baczkowicz - initial API and implementation and/or initial documentation
 *    
 */
package pl.baczkowicz.mqttspy.connectivity;

import pl.baczkowicz.mqttspy.common.generated.FormatterDetails;
import pl.baczkowicz.mqttspy.configuration.ConfiguredConnectionDetails;
import pl.baczkowicz.mqttspy.exceptions.ConfigurationException;

public class RuntimeConnectionProperties extends MqttConnectionDetailsWithOptions
{
	private ConfiguredConnectionDetails configuredProperties;

	public RuntimeConnectionProperties(final ConfiguredConnectionDetails configuredProperties) throws ConfigurationException
	{	
		super(configuredProperties.getId(), configuredProperties);
		this.configuredProperties = configuredProperties;		
	}
	
	public FormatterDetails getFormatter()
	{
		return (FormatterDetails) configuredProperties.getFormatter();
	}

	public int getMaxMessagesStored()
	{
		return configuredProperties.getMaxMessagesStored();
	}

	public boolean isAutoConnect()
	{
		return configuredProperties.isAutoConnect();
	}
	
	public ConfiguredConnectionDetails getConfiguredProperties()
	{
		return this.configuredProperties;
	}
	
	public int getId()
	{
		return this.configuredProperties.getId();
	}
}
