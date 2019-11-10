/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv02b05c02irisexperiments_;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.RenameAttribute;
import weka.classifiers.evaluation.Evaluation;
import weka.classifiers.rules.ZeroR;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.lazy.IBk;
import weka.classifiers.trees.J48;
import weka.classifiers.meta.AdaBoostM1;

/**
 *
 * @author pedro
 */
public class IrisExperiments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        //First we open stream to a data set as provided on http://archive.ics.uci.edu
        CSVLoader loader = new CSVLoader();
        try {
            loader.setSource(new URL("http://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data").openStream());
        } catch (IOException ex) {
            Logger.getLogger(IrisExperiments.class.getName()).log(Level.SEVERE, null, ex);
        }
        Instances data;
        try {
            data = loader.getDataSet();
            System.out.println("This file has " + data.numInstances() + " examples.");
            System.out.println("The first example looks like this: ");
            for (int i = 0; i < data.instance(0).numAttributes(); i++) {
                System.out.println(data.instance(0).attribute(i));
            }
        } catch (IOException ex) {
            Logger.getLogger(IrisExperiments.class.getName()).log(Level.SEVERE, null, ex);
        }

        //This file has 149 examples with 5 attributes
        //In order:
        // sepal length in cm
        // sepal width in cm
        // petal length in cm
        // petal width in cm
        // class ( Iris Setosa , Iris Versicolour, Iris Virginica)
        //Let's briefly inspect the data
    }

}
