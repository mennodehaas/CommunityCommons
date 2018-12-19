// This file was generated by Mendix Modeler 6.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MyFirstModule module

	public static system.proxies.Language dS_GetDefaultLanguage(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MyFirstModule.DS_GetDefaultLanguage", params);
			return result == null ? null : system.proxies.Language.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static myfirstmodule.proxies.Container dSO_RandomPasswordContainer(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MyFirstModule.DSO_RandomPasswordContainer", params);
			return result == null ? null : myfirstmodule.proxies.Container.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void hiMessage(IContext context, myfirstmodule.proxies.Entity _entity)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Entity", _entity == null ? null : _entity.getMendixObject());
			Core.execute(context, "MyFirstModule.HiMessage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void iVK_CreateAndMerge(IContext context, java.util.List<myfirstmodule.proxies.MergeTest> _mergeTest)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			java.util.ArrayList<IMendixObject> listparam_mergeTest = null;
			if (_mergeTest != null)
			{
				listparam_mergeTest = new java.util.ArrayList<IMendixObject>();
				for (myfirstmodule.proxies.MergeTest obj : _mergeTest)
					listparam_mergeTest.add(obj.getMendixObject());
			}
			params.put("MergeTest", listparam_mergeTest);
			Core.execute(context, "MyFirstModule.IVK_CreateAndMerge", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void ivk_Customer_Clone(IContext context, myfirstmodule.proxies.Customer _customer)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Customer", _customer == null ? null : _customer.getMendixObject());
			Core.execute(context, "MyFirstModule.Ivk_Customer_Clone", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void iVK_GeneratePDF(IContext context, myfirstmodule.proxies.RichTextEntity _richTextEntity)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("RichTextEntity", _richTextEntity == null ? null : _richTextEntity.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_GeneratePDF", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void iVK_SanitizeRichText(IContext context, myfirstmodule.proxies.RichTextEntity _richTextEntity)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("RichTextEntity", _richTextEntity == null ? null : _richTextEntity.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_SanitizeRichText", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void microflow(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.Microflow", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void sUB_SanitizeRichText(IContext context, myfirstmodule.proxies.RichTextEntity _richTextEntity)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("RichTextEntity", _richTextEntity == null ? null : _richTextEntity.getMendixObject());
			Core.execute(context, "MyFirstModule.SUB_SanitizeRichText", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void templatetest(IContext context, myfirstmodule.proxies.Entity _entity)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Entity", _entity == null ? null : _entity.getMendixObject());
			Core.execute(context, "MyFirstModule.templatetest", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}