/*                        ShadowClass.java

  Copyright 2003, Bil Lewis

  This program is free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation; either version 2 of the License, or
  (at your option) any later version.
  
  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.
  
  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA   
*/

/*

package com.lambda.Debugger;

import java.util.*;

// The ONLY use of ShadowClass is to take the string


public class ShadowClass  {
private static Hashtable table = new Hashtable();
private String value;

    ShadowClass(String className) {
	value = className;
    }


    public static ShadowClass get(String className) {
	ShadowClass sc = (ShadowClass)table.get(className);
	if (sc == null) {
	    sc = new ShadowClass(className);
	    table.put(className, sc);
	}
	return sc;
    }


    public String toString() {
	return "<Scl "+ value +">";
	//return value;
    }
}
*/
