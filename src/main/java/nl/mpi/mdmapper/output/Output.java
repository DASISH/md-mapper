/*
 * Copyright (C) 2013-2014, The Max Planck Institute for
 * Psycholinguistics.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * A copy of the GNU General Public License is included in the file
 * LICENSE. If that file is missing, see
 * <http://www.gnu.org/licenses/>.
 */

package nl.mpi.mdmapper.output;

/**
 * A general method for converting a facet list into output.
 *
 * @author Lari Lampen (MPI-PL)
 */
public interface Output {
    /**
     * Serialise the facet list into a file or stream (as defined by
     * each subclass).
     */
    public void save(FacetList fl);
}
