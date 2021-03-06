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
package pl.baczkowicz.mqttspy.ui.messagelog;

import pl.baczkowicz.mqttspy.tasks.ProgressUpdater;
import javafx.concurrent.Task;

/**
 * Base class for updating task's progress.
 * 
 * @param <T> Type of the task
 */
public abstract class TaskWithProgressUpdater<T> extends Task<T> implements ProgressUpdater
{
	@Override
	public void update(long current, long max)
	{
		super.updateProgress(current, max);		
	}
}
