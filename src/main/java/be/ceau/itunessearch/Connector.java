/*
	Copyright 2016 Marceau Dewilde <m@ceau.be>
	
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
package be.ceau.itunessearch;

import java.io.IOException;

import be.ceau.itunessearch.models.Search;

/**
 * Interface to implement HTTP connection behavior between the library and
 * iTunes.
 */
public interface Connector {

	/**
	 * Perform an HTTP request. Return the response as String.
	 * 
	 * @param link
	 *            the link, as output from {@link Search#build()}
	 * @return iTunes response as string
	 * @throws IOException
	 */
	public String get(String link) throws IOException;

}
