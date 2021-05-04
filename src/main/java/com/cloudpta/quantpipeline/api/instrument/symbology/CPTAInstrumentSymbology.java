/*

Copyright 2017-2019 Advanced Products Limited, 
dannyb@cloudpta.com
github.com/dannyb2018

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*/
package com.cloudpta.quantpipeline.api.instrument.symbology;

/**
 *
 * @author Danny
 */
public class CPTAInstrumentSymbology
{
    public String getID()
    {
        return id;
    }
    
    public void setID( String newID )
    {
        id = newID;
    }
    
    public String getIDSource()
    {
        return idSource;
    }
    
    public void setIDSource( String IDSource )
    {
        idSource = IDSource;
    }

    @Override
    public boolean equals(Object other)
    {
        // Assume isnt
        boolean isEqual = false;

        try
        {
            // cast to symbology
            CPTAInstrumentSymbology otherSymbology = (CPTAInstrumentSymbology)other;
            // compare symbols
            if(true == id.equals(otherSymbology.id))
            {
                // compare ids
                // either both ids are null
                boolean bothSourcesNull = (null == idSource) && (null == otherSymbology.idSource);
                if(true == bothSourcesNull)
                {
                    isEqual = true;
                } 
                else if(true == idSource.equals(otherSymbology.idSource))
                {
                    isEqual = true;
                }
            }
        }
        catch(Exception E)
        {
            // do nothing
        }

        return isEqual;
    }

    public static void main(String[] args)
    {
        CPTAInstrumentSymbology s1 = new CPTAInstrumentSymbology();
        s1.setID("test");
        CPTAInstrumentSymbology s2 = new CPTAInstrumentSymbology();
        s2.setID("test");
        if(true == s2.equals(s1))
        {
            int i = 0;
        }
    }
    protected String id;
    protected String idSource = null;
}
