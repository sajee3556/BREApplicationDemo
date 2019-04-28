

Pattern Matching
The process of matching the new or existing facts against Production Rules is called Pattern Matching, which is performed by the Inference Engine.
There are a number of algorithms used for Pattern Matching including:

Linear
Rete
Treat
Leaps

1. Rules
   The heart of the Rules Engine where you specify conditions

2. Facts
   Facts are the data on which the rules will act upon. From Java perspective, Facts are the POJO (Plain Old Java Object).

3. Session
   A Knowledge Session in Drools is the core component to fire the rules. It is the knowledge session that holds all the rules and other resources. A Knowledge Session is created from the KnowledgeBase.

   For the rules engine to work, Facts are inserted into the session and when a condition is met, the subsequent rule gets fired. A Session is of two types:

   * Stateless Knowledge Session
   * Stateful Knowledge Session

4.Agenda
  It’s a logical concept. The agenda is the logical place where activations are waiting to be fired.

5. Activations
   Activations are the then part of the rule. Activations are placed in the agenda where the appropriate rule is fired

*******************************************************************************************

Rule names within a package must be unique.
Packages in Rules are similar to packages in Java.

**********************************************
Knowledge Base
Knowledge Base is an interface that manages a collection of rules, processes, and internal types.
It is contained inside the package org.drools.KnowledgeBase.
In Drools, these are commonly referred to as knowledge definitions or knowledge.
Knowledge definitions are grouped into knowledge packages.
Knowledge definitions can be added or removed.
The main purpose of Knowledge Base is to store and reuse them because their creation is expensive.
Knowledge Base provides methods for creating knowledge sessions.

