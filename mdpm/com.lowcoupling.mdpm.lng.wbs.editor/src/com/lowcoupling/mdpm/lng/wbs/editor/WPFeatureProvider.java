package com.lowcoupling.mdpm.lng.wbs.editor;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

public class WPFeatureProvider extends DefaultFeatureProvider {
 
    public WPFeatureProvider(IDiagramTypeProvider dtp) {
        super(dtp);
    }
    
    @Override
    public IAddFeature getAddFeature(IAddContext context) {
        // is object for add request a EClass?
       // if (context.getNewObject() instanceof EClass) {
       //     return new TutorialAddEClassFeature(this);
       // }
       // return super.getAddFeature(context);
    	return new AddWPFeature(this);
    }
    
    @Override
    public ICreateFeature[] getCreateFeatures() {
       return new ICreateFeature[] { new CreateWPFeature(this) };
    }
} 