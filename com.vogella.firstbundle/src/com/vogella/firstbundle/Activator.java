package com.vogella.firstbundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.vogella.firstbundle.internal.MyThread;

public class Activator implements BundleActivator {

	private MyThread myThread;
	
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Starting com.vogella.osgi.firstbundle");
		myThread = new MyThread();
		myThread.start();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stopping com.vogella.osgi.firstbundle");
		myThread.stopThread();
		myThread.join();
	}

}
